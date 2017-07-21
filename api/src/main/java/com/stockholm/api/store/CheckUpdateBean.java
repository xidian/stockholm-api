package com.stockholm.api.store;


public class CheckUpdateBean {

    private int versionCode;
    private String packageName;
    private String deviceDownloadUrl;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDeviceDownloadUrl() {
        return deviceDownloadUrl;
    }

    public void setDeviceDownloadUrl(String deviceDownloadUrl) {
        this.deviceDownloadUrl = deviceDownloadUrl;
    }

}