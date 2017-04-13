package com.stockholm.api.socket;


import com.google.gson.Gson;
import com.stockholm.api.push.PushMessage;

public class SocketReq {
    private int action;
    private String accessToken;
    private PushMessage pushMessage;

    public SocketReq(int action, String accessToken, PushMessage pushMessage) {
        this.action = action;
        this.accessToken = accessToken;
        this.pushMessage = pushMessage;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public PushMessage getPushMessage() {
        return pushMessage;
    }

    public void setPushMessage(PushMessage pushMessage) {
        this.pushMessage = pushMessage;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static SocketReq get(String json) {
        return new Gson().fromJson(json, SocketReq.class);
    }

}