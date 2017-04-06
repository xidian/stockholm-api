package com.stockholm.api.socket;


import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class MinaSocketHelper {

    private static MinaSocketHelper helper;
    private DeviceServiceReceiver serviceReceiver;
    private MobileServiceReceiver mobileReceiver;
    private ConnectFuture connectFuture;

    public static MinaSocketHelper getInstance() {
        if (helper == null) {
            synchronized (MinaSocketHelper.class) {
                if (helper == null) {
                    return new MinaSocketHelper();
                }
            }
        }
        return helper;
    }

    private MinaSocketHelper() {

    }

    public void setDeviceMessageReceiver(DeviceServiceReceiver serviceReceiver) {
        this.serviceReceiver = serviceReceiver;
    }

    public void setMobileMessageReceiver(MobileServiceReceiver mobileReceiver) {
        this.mobileReceiver = mobileReceiver;
    }

    public void startDeviceService(int port) throws IOException {
        NioSocketAcceptor socketAcceptor = new NioSocketAcceptor();
        socketAcceptor.getSessionConfig().setReadBufferSize(2048);
        socketAcceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);
        socketAcceptor.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        socketAcceptor.setHandler(new IoHandlerAdapter() {
            @Override
            public void messageReceived(IoSession session, Object message) throws Exception {
                serviceReceiver.onMessageReceived(message.toString());
            }

            @Override
            public void messageSent(IoSession session, Object message) throws Exception {

            }
        });
        socketAcceptor.bind(new InetSocketAddress(port));
    }

    public void startMobileService(String address, int port) {
        NioSocketConnector clientConnect = new NioSocketConnector();
        clientConnect.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        clientConnect.setConnectTimeoutCheckInterval(15);
        clientConnect.setHandler(new IoHandlerAdapter() {
            @Override
            public void messageReceived(IoSession session, Object message) throws Exception {
                mobileReceiver.onMessageReceived(message.toString());
            }
        });

        // 建立连接
        connectFuture = clientConnect.connect(new InetSocketAddress(address, port));
        // 等待连接创建完成
        connectFuture.awaitUninterruptibly();

        // 等待连接断开
        connectFuture.getSession().getCloseFuture().awaitUninterruptibly();
        // 释放连接
        clientConnect.dispose();
    }

    public void sendMsgToService(String message) {
        if (connectFuture.isConnected()) {
            connectFuture.getSession().write(message);
        }
    }

    public interface DeviceServiceReceiver {
        void onMessageReceived(String message);
    }

    public interface MobileServiceReceiver {
        void onMessageReceived(String message);
    }

}