package com.stockholm.api.store;


import com.google.gson.Gson;

import java.io.Serializable;

public class AppBean implements Serializable {
    private String appName;
    private String packageName;
    private String priImageUrl;
    private String subImageUrl;
    private String mobileDownloadUrl;
    private String developer;
    private float star;
    private int versionCode;
    private long downloads;
    private int type;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPriImageUrl() {
        return priImageUrl;
    }

    public void setPriImageUrl(String priImageUrl) {
        this.priImageUrl = priImageUrl;
    }

    public String getSubImageUrl() {
        return subImageUrl;
    }

    public void setSubImageUrl(String subImageUrl) {
        this.subImageUrl = subImageUrl;
    }

    public String getMobileDownloadUrl() {
        return mobileDownloadUrl;
    }

    public void setMobileDownloadUrl(String mobileDownloadUrl) {
        this.mobileDownloadUrl = mobileDownloadUrl;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AppBean get(String json) {
        return new Gson().fromJson(json, AppBean.class);
    }

}