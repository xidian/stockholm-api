package com.stockholm.api.setting.system;

import java.util.List;

public class SortVisibilityReq {

    private List<AppStateBean> appsConfigs;

    public SortVisibilityReq(List<AppStateBean> appsConfigs) {
        this.appsConfigs = appsConfigs;
    }

    public List<AppStateBean> getAppsConfigs() {
        return appsConfigs;
    }

    public void setAppsConfigs(List<AppStateBean> appsConfigs) {
        this.appsConfigs = appsConfigs;
    }
}
