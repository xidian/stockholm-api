package com.stockholm.api.setting;

import com.google.gson.Gson;

public class AppUpdateConfigReq {

    private String config;

    public AppUpdateConfigReq() {
    }

    public AppUpdateConfigReq(String config) {
        setConfig(config);
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AppUpdateConfigReq get(String json) {
        return new Gson().fromJson(json, AppUpdateConfigReq.class);
    }

}