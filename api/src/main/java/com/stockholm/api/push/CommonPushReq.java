package com.stockholm.api.push;


import com.google.gson.Gson;

public class CommonPushReq {
    private PushMessage extras;

    public CommonPushReq() {
    }

    public CommonPushReq(PushMessage extras) {
        setExtras(extras);
    }

    public PushMessage getExtras() {
        return extras;
    }

    public void setExtras(PushMessage extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static CommonPushReq get(String json) {
        return new Gson().fromJson(json, CommonPushReq.class);
    }

}