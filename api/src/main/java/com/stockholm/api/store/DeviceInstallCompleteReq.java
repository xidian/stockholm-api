package com.stockholm.api.store;


public class DeviceInstallCompleteReq {

    private AppBean app;

    public DeviceInstallCompleteReq(String packageName, int versionCode) {
        this.app = new AppBean(packageName, versionCode);
    }

    public AppBean getApp() {
        return app;
    }

    public void setApp(AppBean app) {
        this.app = app;
    }

    public static class AppBean {

        private String packageName;
        private int versionCode;

        public AppBean(String packageName, int versionCode) {
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