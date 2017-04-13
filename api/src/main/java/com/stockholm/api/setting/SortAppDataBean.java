package com.stockholm.api.setting;


public class SortAppDataBean {

    private String packageName;
    private int orderNumber;

    public SortAppDataBean(String packageName, int orderNumber) {
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