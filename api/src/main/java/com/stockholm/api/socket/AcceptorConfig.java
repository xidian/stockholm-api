package com.stockholm.api.socket;


import org.apache.mina.core.service.IoHandler;

public class AcceptorConfig {
    private int port;
    private int readBufferSize;
    private int idleTime;
    private IoHandler ioHandler;

    public int getPort() {
        return port;
    }

    public int getReadBufferSize() {
        return readBufferSize;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public IoHandler getIoHandler() {
        return ioHandler;
    }

    public static class Builder {
        private int port = 6868;
        private int readBufferSize = 2048;
        private int idleTime = 5 * 60;
        private IoHandler ioHandler;

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setReadBufferSize(int readBufferSize) {
            this.readBufferSize = readBufferSize;
            return this;
        }

        public Builder setIdleTime(int idleTime) {
            this.idleTime = idleTime;
            return this;
        }

        public Builder setIoHandler(IoHandler ioHandler) {
            this.ioHandler = ioHandler;
            return this;
        }

        private void applyConfig(AcceptorConfig config) {
            config.port = this.port;
            config.readBufferSize = this.readBufferSize;
            config.idleTime = this.idleTime;
            config.ioHandler = this.ioHandler;
        }

        public AcceptorConfig builder() {
            AcceptorConfig config = new AcceptorConfig();
            applyConfig(config);
            return config;
        }
    }

}