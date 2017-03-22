package com.stockholm.api.setting;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class GetClockAppsResp {
    private boolean success;
    private String msg;
    private List<DataBean> data = new ArrayList<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String packageName;
        private String phoneNumber;
        private String appName;
        private String icon;
        private String uuid;
        private String config;
        private int versionCode;
        private boolean removable;
        private String mobileDownloadUrl;
        private boolean isHidden;
        private int orderNumber;

        public DataBean(String packageName, String phoneNumber, String appName, String icon,
                        String uuid, String config, int versionCode, boolean removable,
                        String mobileDownloadUrl, boolean isHidden, int orderNumber) {
            setPackageName(packageName);
            setPhoneNumber(phoneNumber);
            setAppName(appName);
            setIcon(icon);
            setUuid(uuid);
            setConfig(config);
            setVersionCode(versionCode);
            setRemovable(removable);
            setMobileDownloadUrl(mobileDownloadUrl);
            setHidden(isHidden);
            setOrderNumber(orderNumber);
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getConfig() {
            return config;
        }

        public void setConfig(String config) {
            this.config = config;
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

        public String getMobileDownloadUrl() {
            return mobileDownloadUrl;
        }

        public void setMobileDownloadUrl(String mobileDownloadUrl) {
            this.mobileDownloadUrl = mobileDownloadUrl;
        }

        public boolean isHidden() {
            return isHidden;
        }

        public void setHidden(boolean hidden) {
            isHidden = hidden;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

        public static DataBean get(String json) {
            return new Gson().fromJson(json, DataBean.class);
        }
    }

}