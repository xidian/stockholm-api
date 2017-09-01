package com.stockholm.api.rom;

public class RomInfo {

    public RomInfo(String mid, String oem, String models, String platform, String deviceType, String versionName, String version) {
        this.mid = mid;
        this.oem = oem;
        this.models = models;
        this.platform = platform;
        this.deviceType = deviceType;
        this.versionName = versionName;
        this.version = version;
    }

    private String mid;

    private String oem;

    private String models;

    private String platform;

    private String deviceType;

    private String versionName;

    private String version;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
