package com.stockholm.api.store;

public class PreInstallAppBean {
    private String packageName;
    private int versionCode;

    public PreInstallAppBean(String packageName, int versionCode) {
        this.packageName = packageName;
        this.versionCode = versionCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

}