package com.stockholm.api.bind;

public class BindReq {

    private String uuid;
    private String installedApps;

    public BindReq(String uuid, String installedApps) {
        setUuid(uuid);
        setInstalledApps(installedApps);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getInstalledApps() {
        return installedApps;
    }

    public void setInstalledApps(String installedApps) {
        this.installedApps = installedApps;
    }
}
