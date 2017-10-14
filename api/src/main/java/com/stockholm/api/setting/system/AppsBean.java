package com.stockholm.api.setting.system;


public class AppsBean {

    private String packageName;
    private String name;
    private String iconUrl;
    private String grayedIconUrl;
    private int versionCode;
    private boolean removable;
    private String downloadUrl;
    private boolean hidden;
    private int orderNumber;
    private long apkSize;

    public AppsBean() {
    }

    public AppsBean(String packageName, String name, String iconUrl, String grayedIconUrl, int versionCode,
                    boolean removable, String downloadUrl, boolean hidden, int orderNumber, long apkSize) {
        this.packageName = packageName;
        this.name = name;
        this.iconUrl = iconUrl;
        this.grayedIconUrl = grayedIconUrl;
        this.versionCode = versionCode;
        this.removable = removable;
        this.downloadUrl = downloadUrl;
        this.hidden = hidden;
        this.orderNumber = orderNumber;
        this.apkSize = apkSize;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getGrayedIconUrl() {
        return grayedIconUrl;
    }

    public void setGrayedIconUrl(String grayedIconUrl) {
        this.grayedIconUrl = grayedIconUrl;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public boolean isRemovable() {
        return removable;
    }

    public void setRemovable(boolean removable) {
        this.removable = removable;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public long getApkSize() {
        return apkSize;
    }

    public void setApkSize(long apkSize) {
        this.apkSize = apkSize;
    }

}