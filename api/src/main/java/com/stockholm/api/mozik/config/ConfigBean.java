package com.stockholm.api.mozik.config;


import com.google.gson.Gson;
import com.stockholm.api.mozik.api.WallpaperBean;

public class ConfigBean {
    private String token;
    private WallpaperBean wallpaper;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public WallpaperBean getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(WallpaperBean wallpaper) {
        this.wallpaper = wallpaper;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static ConfigBean get(String json) {
        return new Gson().fromJson(json, ConfigBean.class);
    }

}