package com.stockholm.api.setting;


import com.google.gson.Gson;

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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static UpdateAppStateReq get(String json) {
        return new Gson().fromJson(json, UpdateAppStateReq.class);
    }

}