package com.stockholm.api.display;


import com.google.gson.Gson;

public class DisplayConfigBean {
    private boolean openAutoDisplay;

    public DisplayConfigBean(boolean openAutoDisplay) {
        this.openAutoDisplay = openAutoDisplay;
    }

    public boolean isOpenAutoDisplay() {
        return openAutoDisplay;
    }

    public void setOpenAutoDisplay(boolean openAutoDisplay) {
        this.openAutoDisplay = openAutoDisplay;
    }

    @Override
    public String toString() {
        return new Gson().toString();
    }

    public static DisplayConfigBean get(String json) {
        return new Gson().fromJson(json, DisplayConfigBean.class);
    }

}