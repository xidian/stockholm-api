package com.stockholm.api.store;


public class MobileInstallAppReq {
    private String packageName;

    public MobileInstallAppReq(String packageName) {
        setPackageName(packageName);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

}