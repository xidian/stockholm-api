package com.stockholm.api.store;


public class MobileOperateAppReq {
    private String packageName;

    public MobileOperateAppReq(String packageName) {
        setPackageName(packageName);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

}