package com.stockholm.api.mozik.config;


import com.google.gson.Gson;
import com.stockholm.api.mozik.api.WallpaperBean;

public class ConfigBean {
    private UserBean user;
    private WallpaperBean wallpaper;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
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