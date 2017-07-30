package com.stockholm.api.push;


import com.google.gson.Gson;

public class PushMessage {
    private int order;
    private String packageName;
    private String addition;

    public PushMessage() {
    }

    public PushMessage(int order) {
        setOrder(order);
    }

    public PushMessage(int order, String packageName) {
        setOrder(order);
        setPackageName(packageName);
    }

    public PushMessage(int order, String packageName, String addition) {
        setOrder(order);
        setPackageName(packageName);
        setAddition(addition);
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

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static PushMessage get(String json) {
        return new Gson().fromJson(json, PushMessage.class);
    }

}