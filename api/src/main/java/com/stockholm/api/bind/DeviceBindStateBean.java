package com.stockholm.api.bind;


public class DeviceBindStateBean {
    private int usersCount;
    private boolean showGuide;
    private boolean enableAutoDisplay;

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public boolean isShowGuide() {
        return showGuide;
    }

    public void setShowGuide(boolean showGuide) {
        this.showGuide = showGuide;
    }

    public boolean isDeviceBinded() {
        return usersCount > 0;
    }

    public boolean isEnableAutoDisplay() {
        return enableAutoDisplay;
    }

    public void setEnableAutoDisplay(boolean enableAutoDisplay) {
        this.enableAutoDisplay = enableAutoDisplay;
    }

}