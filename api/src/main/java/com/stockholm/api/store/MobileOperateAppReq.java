package com.stockholm.api.store;


public class MobileOperateAppReq {
    private boolean update;
    private String packageName;

    public MobileOperateAppReq(boolean update, String packageName) {
        setUpdate(update);
        setPackageName(packageName);
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

}