package com.stockholm.api.launcher;

public class RegistrationIdReq {

    private String uuid;
    private String pushToken;

    public RegistrationIdReq(String uuid, String pushToken) {
        setUuid(uuid);
        setPushToken(pushToken);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }
}
