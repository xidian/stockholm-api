package com.stockholm.api.store;

public class CheckInstalledReq {

    private AppBean app;

    public CheckInstalledReq(String packageName) {
        this.app = new AppBean(packageName);
    }

    public AppBean getApp() {
        return app;
    }

    public void setApp(AppBean app) {
        this.app = app;
    }

    public static class AppBean {
        private String packageName;

        public AppBean(String packageName) {
            this.packageName = packageName;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }
    }

}
