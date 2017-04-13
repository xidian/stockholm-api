package com.stockholm.api.setting;


import com.google.gson.Gson;

import java.util.List;

public class SortAppListReq {
    private List<SortAppDataBean> apps;

    public SortAppListReq(List<SortAppDataBean> apps) {
        setApps(apps);
    }

    public List<SortAppDataBean> getApps() {
        return apps;
    }

    public void setApps(List<SortAppDataBean> apps) {
        this.apps = apps;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static SortAppListReq get(String json) {
        return new Gson().fromJson(json, SortAppListReq.class);
    }

}