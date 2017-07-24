package com.stockholm.api.bind;


public class RegisterDeviceReq {
    private String uuid;
    private String token;

    public RegisterDeviceReq(String uuid, String token) {
        this.uuid = uuid;
        this.token = token;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}