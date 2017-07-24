package com.stockholm.api.bind;


public class UpdatePushTokenReq {
    private String pushToken;

    public UpdatePushTokenReq(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

}