package com.stockholm.api.socket;


import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoHandler;
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

    private ConnectFuture connectFuture;
    private NioSocketConnector clientConnect;
    private NioSocketAcceptor socketAcceptor;

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

    public void startDeviceService(int port, final IoHandlerCallback deviceIoHandler) throws IOException {
        socketAcceptor = new NioSocketAcceptor();
        socketAcceptor.getSessionConfig().setReadBufferSize(2048);
        socketAcceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);
        socketAcceptor.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        socketAcceptor.setHandler(new IoHandler() {
            @Override
            public void sessionCreated(IoSession ioSession) throws Exception {
                deviceIoHandler.sessionCreated(ioSession);
            }

            @Override
            public void sessionOpened(IoSession ioSession) throws Exception {
                deviceIoHandler.sessionOpened(ioSession);
            }

            @Override
            public void sessionClosed(IoSession ioSession) throws Exception {
                deviceIoHandler.sessionClosed(ioSession);
            }

            @Override
            public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) throws Exception {
                deviceIoHandler.sessionIdle(ioSession, idleStatus);
            }

            @Override
            public void exceptionCaught(IoSession ioSession, Throwable throwable) throws Exception {
                deviceIoHandler.exceptionCaught(ioSession, throwable);
            }

            @Override
            public void messageReceived(IoSession ioSession, Object o) throws Exception {
                deviceIoHandler.messageReceived(ioSession, o);
            }

            @Override
            public void messageSent(IoSession ioSession, Object o) throws Exception {
                deviceIoHandler.messageSent(ioSession, o);
            }

            @Override
            public void inputClosed(IoSession ioSession) throws Exception {
                deviceIoHandler.inputClosed(ioSession);
            }
        });
        socketAcceptor.bind(new InetSocketAddress(port));
    }

    public void startMobileService(String address, int port, final IoHandlerCallback mobileIoHandler) {
        clientConnect = new NioSocketConnector();
        clientConnect.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        clientConnect.setConnectTimeoutCheckInterval(15);
        clientConnect.setHandler(new IoHandler() {
            @Override
            public void sessionCreated(IoSession ioSession) throws Exception {
                mobileIoHandler.sessionCreated(ioSession);
            }

            @Override
            public void sessionOpened(IoSession ioSession) throws Exception {
                mobileIoHandler.sessionOpened(ioSession);
            }

            @Override
            public void sessionClosed(IoSession ioSession) throws Exception {
                ioSession.closeNow();
                mobileIoHandler.sessionClosed(ioSession);
            }

            @Override
            public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) throws Exception {
                mobileIoHandler.sessionIdle(ioSession, idleStatus);
            }

            @Override
            public void exceptionCaught(IoSession ioSession, Throwable throwable) throws Exception {
                mobileIoHandler.exceptionCaught(ioSession, throwable);
            }

            @Override
            public void messageReceived(IoSession ioSession, Object o) throws Exception {
                mobileIoHandler.messageReceived(ioSession, o);
            }

            @Override
            public void messageSent(IoSession ioSession, Object o) throws Exception {
                mobileIoHandler.messageSent(ioSession, o);
            }

            @Override
            public void inputClosed(IoSession ioSession) throws Exception {
                mobileIoHandler.inputClosed(ioSession);
            }
        });

        // 建立连接
        connectFuture = clientConnect.connect(new InetSocketAddress(address, port));
        // 等待连接创建完成
        connectFuture.awaitUninterruptibly();
    }

    public void closeDeviceSocket() {
        if (socketAcceptor != null && socketAcceptor.isActive()) {
            socketAcceptor.unbind();
        }
    }

    public void closeMobileSocket() {
        if (connectFuture != null && connectFuture.isConnected()) {
            // 等待连接断开
            connectFuture.getSession().getCloseFuture().awaitUninterruptibly();
            // 释放连接
            clientConnect.dispose();
        }
    }

}