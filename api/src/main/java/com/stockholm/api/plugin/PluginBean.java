package com.stockholm.api.plugin;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;


public class PluginBean implements Parcelable {
    public static final Parcelable.Creator<PluginBean> CREATOR = new Parcelable.Creator<PluginBean>() {
        @Override
        public PluginBean createFromParcel(Parcel source) {
            return new PluginBean(source);
        }

        @Override
        public PluginBean[] newArray(int size) {
            return new PluginBean[size];
        }
    };

    private UserBean userBean;
    private ConfigBean configBean;
    private SocketBean socketBean;
    private TaskAppBean taskAppBean;

    protected PluginBean(Parcel in) {
        this.userBean = in.readParcelable(UserBean.class.getClassLoader());
        this.configBean = in.readParcelable(ConfigBean.class.getClassLoader());
        this.socketBean = in.readParcelable(SocketBean.class.getClassLoader());
        this.taskAppBean = in.readParcelable(TaskAppBean.class.getClassLoader());
    }

    public PluginBean(UserBean userBean, ConfigBean configBean, SocketBean socketBean) {
        setUserBean(userBean);
        setConfigBean(configBean);
        setSocketBean(socketBean);
    }

    public PluginBean(UserBean userBean, ConfigBean configBean, SocketBean socketBean, TaskAppBean taskAppBean) {
        setUserBean(userBean);
        setConfigBean(configBean);
        setSocketBean(socketBean);
        setTaskAppBean(taskAppBean);
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

    public TaskAppBean getTaskAppBean() {
        return taskAppBean;
    }

    public void setTaskAppBean(TaskAppBean taskAppBean) {
        this.taskAppBean = taskAppBean;
    }

    public static class UserBean implements Parcelable {

        private String deviceId;
        private String accessToken;

        public UserBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.deviceId);
            dest.writeString(this.accessToken);
        }

        protected UserBean(Parcel in) {
            this.deviceId = in.readString();
            this.accessToken = in.readString();
        }

        public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
            @Override
            public UserBean createFromParcel(Parcel source) {
                return new UserBean(source);
            }

            @Override
            public UserBean[] newArray(int size) {
                return new UserBean[size];
            }
        };
    }

    public static class ConfigBean implements Parcelable {

        private int mediaVolume;
        private boolean showVolumeGuide;

        public ConfigBean() {
        }

        public ConfigBean(int mediaVolume) {
            setMediaVolume(mediaVolume);
        }

        public ConfigBean(int mediaVolume, boolean showVolumeGuide) {
            setMediaVolume(mediaVolume);
            setShowVolumeGuide(showVolumeGuide);
        }

        public int getMediaVolume() {
            return mediaVolume;
        }

        public void setMediaVolume(int mediaVolume) {
            this.mediaVolume = mediaVolume;
        }

        public boolean isShowVolumeGuide() {
            return showVolumeGuide;
        }

        public void setShowVolumeGuide(boolean showVolumeGuide) {
            this.showVolumeGuide = showVolumeGuide;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.mediaVolume);
            dest.writeByte(this.showVolumeGuide ? (byte) 1 : (byte) 0);
        }

        protected ConfigBean(Parcel in) {
            this.mediaVolume = in.readInt();
            this.showVolumeGuide = in.readByte() != 0;
        }

        public static final Creator<ConfigBean> CREATOR = new Creator<ConfigBean>() {
            @Override
            public ConfigBean createFromParcel(Parcel source) {
                return new ConfigBean(source);
            }

            @Override
            public ConfigBean[] newArray(int size) {
                return new ConfigBean[size];
            }
        };
    }

    public static class SocketBean implements Parcelable {

        private String serverName;
        private String serverAddress;
        private int serverPort;

        public SocketBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.serverName);
            dest.writeString(this.serverAddress);
            dest.writeInt(this.serverPort);
        }

        protected SocketBean(Parcel in) {
            this.serverName = in.readString();
            this.serverAddress = in.readString();
            this.serverPort = in.readInt();
        }

        public static final Creator<SocketBean> CREATOR = new Creator<SocketBean>() {
            @Override
            public SocketBean createFromParcel(Parcel source) {
                return new SocketBean(source);
            }

            @Override
            public SocketBean[] newArray(int size) {
                return new SocketBean[size];
            }
        };
    }

    public static class TaskAppBean implements Parcelable {
        private boolean weather;
        private boolean fm;
        private boolean news;
        private boolean music;

        public TaskAppBean() {
        }

        public TaskAppBean(boolean weather, boolean fm, boolean news, boolean music) {
            this.weather = weather;
            this.fm = fm;
            this.news = news;
            this.music = music;
        }

        public boolean isWeather() {
            return weather;
        }

        public void setWeather(boolean weather) {
            this.weather = weather;
        }

        public boolean isFm() {
            return fm;
        }

        public void setFm(boolean fm) {
            this.fm = fm;
        }

        public boolean isNews() {
            return news;
        }

        public void setNews(boolean news) {
            this.news = news;
        }

        public boolean isMusic() {
            return music;
        }

        public void setMusic(boolean music) {
            this.music = music;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeByte(this.weather ? (byte) 1 : (byte) 0);
            dest.writeByte(this.fm ? (byte) 1 : (byte) 0);
            dest.writeByte(this.news ? (byte) 1 : (byte) 0);
            dest.writeByte(this.music ? (byte) 1 : (byte) 0);
        }

        protected TaskAppBean(Parcel in) {
            this.weather = in.readByte() != 0;
            this.fm = in.readByte() != 0;
            this.news = in.readByte() != 0;
            this.music = in.readByte() != 0;
        }

        public static final Creator<TaskAppBean> CREATOR = new Creator<TaskAppBean>() {
            @Override
            public TaskAppBean createFromParcel(Parcel source) {
                return new TaskAppBean(source);
            }

            @Override
            public TaskAppBean[] newArray(int size) {
                return new TaskAppBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.userBean, flags);
        dest.writeParcelable(this.configBean, flags);
        dest.writeParcelable(this.socketBean, flags);
        dest.writeParcelable(this.taskAppBean, flags);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static PluginBean get(String json) {
        return new Gson().fromJson(json, PluginBean.class);
    }

}