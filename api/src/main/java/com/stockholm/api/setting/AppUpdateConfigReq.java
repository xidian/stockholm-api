package com.stockholm.api.setting;

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
}
