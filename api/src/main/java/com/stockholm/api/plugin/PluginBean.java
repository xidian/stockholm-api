package com.stockholm.api.plugin;

import com.google.gson.Gson;

import java.io.Serializable;


public class PluginBean implements Serializable {

    private UserBean userBean;
    private ConfigBean configBean;
    private SocketBean socketBean;

    public PluginBean(UserBean userBean, ConfigBean configBean, SocketBean socketBean) {
        setUserBean(userBean);
        setConfigBean(configBean);
        setSocketBean(socketBean);
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public ConfigBean getConfigBean() {
        return configBean;
    }

    public void setConfigBean(ConfigBean configBean) {
        this.configBean = configBean;
    }

    public SocketBean getSocketBean() {
        return socketBean;
    }

    public void setSocketBean(SocketBean socketBean) {
        this.socketBean = socketBean;
    }

    public static class UserBean implements Serializable {
        private String deviceId;
        private String accessToken;

        public UserBean(String deviceId, String accessToken) {
            setDeviceId(deviceId);
            setAccessToken(accessToken);
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }
    }

    public static class ConfigBean implements Serializable {
        private int mediaVolume;

        public ConfigBean(int mediaVolume) {
            setMediaVolume(mediaVolume);
        }

        public int getMediaVolume() {
            return mediaVolume;
        }

        public void setMediaVolume(int mediaVolume) {
            this.mediaVolume = mediaVolume;
        }
    }

    public static class SocketBean implements Serializable {
        private String serverName;
        private String serverAddress;
        private int serverPort;

        public SocketBean(String serverName, String serverAddress, int serverPort) {
            setServerName(serverName);
            setServerAddress(serverAddress);
            setServerPort(serverPort);
        }

        public String getServerName() {
            return serverName;
        }

        public void setServerName(String serverName) {
            this.serverName = serverName;
        }

        public String getServerAddress() {
            return serverAddress;
        }

        public void setServerAddress(String serverAddress) {
            this.serverAddress = serverAddress;
        }

        public int getServerPort() {
            return serverPort;
        }

        public void setServerPort(int serverPort) {
            this.serverPort = serverPort;
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static PluginBean get(String json) {
        return new Gson().fromJson(json, PluginBean.class);
    }

}