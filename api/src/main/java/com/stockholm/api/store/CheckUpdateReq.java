package com.stockholm.api.store;


import java.util.List;

public class CheckUpdateReq {
    public List<AppInfoBean> installer;

    public CheckUpdateReq(List<AppInfoBean> apps) {
        setInstaller(apps);
    }

    public List<AppInfoBean> getInstaller() {
        return installer;
    }

    public void setInstaller(List<AppInfoBean> installer) {
        this.installer = installer;
    }

    public static class AppInfoBean {
        private String packageName;
        private int versionCode;

        public AppInfoBean(String packageName, int versionCode) {
            this.packageName = packageName;
            this.versionCode = versionCode;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public int getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(int versionCode) {
            this.versionCode = versionCode;
        }
    }

}
