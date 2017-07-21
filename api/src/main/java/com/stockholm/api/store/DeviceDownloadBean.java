package com.stockholm.api.store;


public class DeviceDownloadBean {
    private String downloadUrl;

    public DeviceDownloadBean(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

}