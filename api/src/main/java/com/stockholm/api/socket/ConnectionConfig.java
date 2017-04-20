package com.stockholm.api.socket;


import org.apache.mina.core.service.IoHandler;

public class ConnectionConfig {

    private String ip;
    private int port;
    private int readBufferSize;
    private int connectionTimeout;
    private int idleTime;
    private IoHandler ioHandler;

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public int getReadBufferSize() {
        return readBufferSize;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public IoHandler getIoHandler() {
        return ioHandler;
    }

    public static class Builder {
        private String ip = "192.168.0.1";
        private int port = 6868;
        private int readBufferSize = 2048;
        private int connectionTimeout = 15;
        private int idleTime = 5 * 60;
        private IoHandler ioHandler;

        public Builder setIp(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setReadBufferSize(int readBufferSize) {
            this.readBufferSize = readBufferSize;
            return this;
        }

        public Builder setConnectionTimeout(int connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
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

        private void applyConfig(ConnectionConfig config) {
            config.ip = this.ip;
            config.port = this.port;
            config.readBufferSize = this.readBufferSize;
            config.connectionTimeout = this.connectionTimeout;
            config.idleTime = this.idleTime;
            config.ioHandler = this.ioHandler;
        }

        public ConnectionConfig builder() {
            ConnectionConfig config = new ConnectionConfig();
            applyConfig(config);
            return config;
        }
    }

}