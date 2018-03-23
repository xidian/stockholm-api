package com.stockholm.api.store;

import java.util.List;

public class InitPreInstallAppsReq {

    private List<PreInstallAppBean> apps;

    public InitPreInstallAppsReq(List<PreInstallAppBean> apps) {
        this.apps = apps;
    }

    public List<PreInstallAppBean> getApps() {
        return apps;
    }

    public void setApps(List<PreInstallAppBean> apps) {
        this.apps = apps;
    }

}