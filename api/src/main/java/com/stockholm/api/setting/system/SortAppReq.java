package com.stockholm.api.setting.system;

import java.util.List;

public class SortAppReq {

    public SortAppReq(List<String> appsConfig) {
        this.appsConfig = appsConfig;
    }

    private List<String> appsConfig;

    public List<String> getAppsConfig() {
        return appsConfig;
    }

    public void setAppsConfig(List<String> appsConfig) {
        this.appsConfig = appsConfig;
    }
}
