package com.stockholm.api.setting;

public class UpdateAppConfigReq {

    private String config;

    public UpdateAppConfigReq() {
    }

    public UpdateAppConfigReq(String config) {
        setConfig(config);
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
