package com.stockholm.api.rom;

/**
 * Created by max on 17-9-20.
 */

public class RomInfoResp {


    /**
     * deviceType : hifi
     * mid : 9bf0e4d4
     * models : meow
     * oem : meowtechnology8909_5.1
     * platform : MSM8909_5.1
     * version : eng.meow.20170830.113645_20170830-1157
     * versionName : eng.meow.20170831.141727_20170831-1419
     */

    private String deviceType;
    private String mid;
    private String models;
    private String oem;
    private String platform;
    private String version;
    private String versionName;
    private String launcherVersion;

    public String getLauncherVersion() {
        return launcherVersion;
    }

    public void setLauncherVersion(String launcherVersion) {
        this.launcherVersion = launcherVersion;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
}
