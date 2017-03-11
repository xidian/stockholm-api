package com.stockholm.api;


import com.google.gson.Gson;

public class PushMessage {
    private int order;
    private String packageName;

    public PushMessage(int order) {
        setOrder(order);
    }

    public PushMessage(int order, String packageName) {
        this.order = order;
        this.packageName = packageName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static PushMessage get(String json) {
        return new Gson().fromJson(json, PushMessage.class);
    }

}