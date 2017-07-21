package com.stockholm.api.store;


public class StoreOperateAppReq {

    private DataBean app;

    public StoreOperateAppReq(String packageName) {
        this.app = new DataBean(packageName);
    }

    public DataBean getApp() {
        return app;
    }

    public void setApp(DataBean app) {
        this.app = app;
    }

    public static class DataBean {
        private String packageName;

        public DataBean(String packageName) {
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