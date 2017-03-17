package com.stockholm.api.store;


import java.util.List;

public class CheckUpdateReq {
    public List<AppInfoBean> apps;

    public List<AppInfoBean> getApps() {
        return apps;
    }

    public void setApps(List<AppInfoBean> apps) {
        this.apps = apps;
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
