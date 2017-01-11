package com.stockholm.api.setting;


public class DeviceUpdateConfigReq {

    private String config;

    public DeviceUpdateConfigReq(String config) {
        setConfig(config);
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
