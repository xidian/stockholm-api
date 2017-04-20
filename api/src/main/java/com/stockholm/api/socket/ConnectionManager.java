package com.stockholm.api.socket;


import android.util.Log;

import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class ConnectionManager {
    private static final String TAG = "ConnectionManager";

    private ConnectionConfig connectionConfig;
    private NioSocketConnector connector;
    private IoSession session;
    private InetSocketAddress address;

    public ConnectionManager(ConnectionConfig connectionConfig) {
        this.connectionConfig = connectionConfig;
        init();
    }

    private void init() {
        address = new InetSocketAddress(connectionConfig.getIp(), connectionConfig.getPort());
        connector = new NioSocketConnector();
        connector.getSessionConfig().setReuseAddress(true);
        connector.getSessionConfig().setReadBufferSize(connectionConfig.getReadBufferSize());
        connector.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, connectionConfig.getIdleTime());
        connector.setConnectTimeoutCheckInterval(connectionConfig.getConnectionTimeout());
        connector.getFilterChain().addFirst("reconnection", new MyIoFilterAdapter());
        connector.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        connector.setHandler(connectionConfig.getIoHandler());
        connector.setDefaultRemoteAddress(address);
    }

    public boolean connect() {
        try {
            ConnectFuture future = connector.connect();
            future.awaitUninterruptibly();
            session = future.getSession();
            if (session != null && session.isConnected()) {
                SessionManager.getInstance().setSession(session);
            } else {
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, "connect error: " + e.toString());
            return false;
        }
        return true;
    }

    public void disConnect() {
        try {
            if (!connector.isDisposing() && !connector.isDisposed()) {
                connector.dispose(true);
            }
            connector = null;
            session = null;
            address = null;
        } catch (Exception e) {
            Log.e(TAG, "disConnect error: " + e.toString());
        }
    }

    private class MyIoFilterAdapter extends IoFilterAdapter {
        @Override
        public void sessionClosed(NextFilter nextFilter, IoSession session) throws Exception {
            Log.d(TAG, session.getId() + "连接关闭,每隔15秒进行重新连接");
            for (; ; ) {
                if (connector == null) {
                    break;
                }
                if (ConnectionManager.this.connect()) {
                    Log.d(TAG, "断线重连[" + connector.getDefaultRemoteAddress().getHostName() + "]成功");
                    break;
                }
                Thread.sleep(15000);
            }
        }
    }

}