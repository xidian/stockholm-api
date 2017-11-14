package com.stockholm.api.display;


public class UpdateConfigReq {
    private DisplayConfigBean config;

    public UpdateConfigReq(DisplayConfigBean config) {
        this.config = config;
    }

    public DisplayConfigBean getConfig() {
        return config;
    }

    public void setConfig(DisplayConfigBean config) {
        this.config = config;
    }

}