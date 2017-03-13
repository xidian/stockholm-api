package com.stockholm.api.store;


public class DeviceInstallCompleteReq {
    private int versionCode;

    public DeviceInstallCompleteReq(int versionCode) {
        setVersionCode(versionCode);
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

}