package com.stockholm.api.display;


import com.google.gson.Gson;

import java.util.List;

public class DisplayConfigBean {
    private boolean openAutoDisplay;
    private List<String> urls;

    public DisplayConfigBean(boolean openAutoDisplay) {
        this.openAutoDisplay = openAutoDisplay;
    }

    public boolean isOpenAutoDisplay() {
        return openAutoDisplay;
    }

    public void setOpenAutoDisplay(boolean openAutoDisplay) {
        this.openAutoDisplay = openAutoDisplay;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return new Gson().toString();
    }

    public static DisplayConfigBean get(String json) {
        return new Gson().fromJson(json, DisplayConfigBean.class);
    }

}