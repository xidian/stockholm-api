package com.stockholm.api.setting;


import java.util.List;

public class SortAppListReq {
    private List<DataBean> apps;

    public SortAppListReq(List<DataBean> apps) {
        setApps(apps);
    }

    public List<DataBean> getApps() {
        return apps;
    }

    public void setApps(List<DataBean> apps) {
        this.apps = apps;
    }

    public static class DataBean {
        private String packageName;
        private int orderNumber;

        public DataBean(String packageName, int orderNumber) {
            setPackageName(packageName);
            setOrderNumber(orderNumber);
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }
    }

}