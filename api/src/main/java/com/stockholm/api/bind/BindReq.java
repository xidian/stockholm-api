package com.stockholm.api.bind;

import java.util.List;

public class BindReq {

    private List<String> installedApps;

    public BindReq(List<String> installedApps) {
        this.installedApps = installedApps;
    }

    public List<String> getInstalledApps() {
        return installedApps;
    }

    public void setInstalledApps(List<String> installedApps) {
        this.installedApps = installedApps;
    }

}