package com.stockholm.api.weather.config;


import com.google.gson.Gson;

public class AlertBean {
    private boolean rainAlert;
    private boolean hazeAlert;
    private boolean coolAlert;

    public AlertBean() {
    }

    public AlertBean(boolean rainAlert, boolean hazeAlert, boolean coolAlert) {
        this.rainAlert = rainAlert;
        this.hazeAlert = hazeAlert;
        this.coolAlert = coolAlert;
    }

    public boolean isRainAlert() {
        return rainAlert;
    }

    public void setRainAlert(boolean rainAlert) {
        this.rainAlert = rainAlert;
    }

    public boolean isHazeAlert() {
        return hazeAlert;
    }

    public void setHazeAlert(boolean hazeAlert) {
        this.hazeAlert = hazeAlert;
    }

    public boolean isCoolAlert() {
        return coolAlert;
    }

    public void setCoolAlert(boolean coolAlert) {
        this.coolAlert = coolAlert;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AlertBean get(String json) {
        return new Gson().fromJson(json, AlertBean.class);
    }

}