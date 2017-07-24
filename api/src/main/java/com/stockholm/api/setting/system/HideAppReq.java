package com.stockholm.api.setting.system;

public class HideAppReq {

    public HideAppReq(AppsConfigBean appsConfig, AppBean app) {
        this.appsConfig = appsConfig;
        this.app = app;
    }

    /**
     * appsConfig : {"hidden":true}
     * app : {"packageName":"com.stockholm.clock"}
     */

    private AppsConfigBean appsConfig;
    private AppBean app;

    public AppsConfigBean getAppsConfig() {
        return appsConfig;
    }

    public void setAppsConfig(AppsConfigBean appsConfig) {
        this.appsConfig = appsConfig;
    }

    public AppBean getApp() {
        return app;
    }

    public void setApp(AppBean app) {
        this.app = app;
    }

    public static class AppsConfigBean {

        public AppsConfigBean(boolean hidden) {
            this.hidden = hidden;
        }

        /**
         * hidden : true
         */

        private boolean hidden;

        public boolean isHidden() {
            return hidden;
        }

        public void setHidden(boolean hidden) {
            this.hidden = hidden;
        }
    }

    public static class AppBean {

        public AppBean(String packageName) {
            this.packageName = packageName;
        }

        /**
         * packageName : com.stockholm.clock
         */

        private String packageName;

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }
    }
}
