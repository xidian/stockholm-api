package com.stockholm.api.setting.system;

public class UpdateSystemConfigReq {

    public UpdateSystemConfigReq(SystemSettingBean config) {
        this.config = config;
    }

    private SystemSettingBean config;

    public SystemSettingBean getConfig() {
        return config;
    }

    public void setConfig(SystemSettingBean config) {
        this.config = config;
    }

}
