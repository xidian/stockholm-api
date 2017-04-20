package com.stockholm.api.socket;


import android.util.Log;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class AcceptorManager {
    private static final String TAG = "AcceptorManager";

    private AcceptorConfig acceptorConfig;
    private NioSocketAcceptor socketAcceptor;
    private int retry = 5;
    private InetSocketAddress address;

    public AcceptorManager(AcceptorConfig config) {
        this.acceptorConfig = config;
        init();
    }

    private void init() {
        address = new InetSocketAddress(acceptorConfig.getPort());
        socketAcceptor = new NioSocketAcceptor();
        socketAcceptor.setReuseAddress(true);
        socketAcceptor.getSessionConfig().setReadBufferSize(acceptorConfig.getReadBufferSize());
        socketAcceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, acceptorConfig.getIdleTime());
        socketAcceptor.getFilterChain().addLast("codec",
                new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        socketAcceptor.setHandler(acceptorConfig.getIoHandler());
        new BindThread().start();
    }

    private boolean bind() {
        if (address == null) return false;
        try {
            socketAcceptor.unbind();
            socketAcceptor.bind(address);
        } catch (Exception e) {
            Log.e(TAG, "bind error: " + e.toString());
            return false;
        }
        return true;
    }

    public void disConnect() {
        try {
            address = null;
            socketAcceptor.unbind();
            if (!socketAcceptor.isDisposed() && !socketAcceptor.isDisposing()) {
                socketAcceptor.dispose(true);
            }
        } catch (Exception e) {
            Log.e(TAG, "disConnect error: " +  e.toString());
        }
    }

    private class BindThread extends Thread {
        boolean isBind;

        @Override
        public void run() {
            for (; ; ) {
                isBind = bind();
                if (isBind) {
                    Log.d(TAG, "设备端Socket绑定成功");
                    break;
                }
                try {
                    Log.d(TAG, "15秒后尝试重新绑定");
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    Log.e(TAG, "bind retry thread: " + e.toString());
                }
            }
        }
    }

}