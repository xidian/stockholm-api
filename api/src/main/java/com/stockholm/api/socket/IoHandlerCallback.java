package com.stockholm.api.socket;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;


public interface IoHandlerCallback {

    void sessionCreated(IoSession ioSession);

    void sessionOpened(IoSession ioSession);

    void sessionClosed(IoSession ioSession);

    void sessionIdle(IoSession ioSession, IdleStatus idleStatus);

    void exceptionCaught(IoSession ioSession, Throwable throwable);

    void messageReceived(IoSession ioSession, Object o);

    void messageSent(IoSession ioSession, Object o);

    void inputClosed(IoSession ioSession);

}