package com.stockholm.api.setting;


public class UpdateAppStateReq {
    private String packageName;
    private boolean isHidden;

    public UpdateAppStateReq(String packageName, boolean isHidden) {
        setPackageName(packageName);
        setHidden(isHidden);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

}