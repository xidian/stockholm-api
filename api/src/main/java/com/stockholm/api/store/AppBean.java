package com.stockholm.api.store;


import com.google.gson.Gson;

import java.io.Serializable;
import java.util.List;

public class AppBean implements Serializable {
    private long id;
    private String iconUrl;
    private String name;
    private String packageName;
    private List<String> screenshotsUrl;
    private String developer;
    private String poster;
    private float star;
    private int versionCode;
    private long downloads;
    private int category;
    private boolean installed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<String> getScreenshotsUrl() {
        return screenshotsUrl;
    }

    public void setScreenshotsUrl(List<String> screenshotsUrl) {
        this.screenshotsUrl = screenshotsUrl;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AppBean get(String json) {
        return new Gson().fromJson(json, AppBean.class);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof AppBean) {
            if (((AppBean) obj).getId() == id && ((AppBean) obj).getPackageName().equals(packageName)) {
                return true;
            }
        }
        return false;
    }

}