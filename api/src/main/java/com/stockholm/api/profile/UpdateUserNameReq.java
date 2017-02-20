package com.stockholm.api.profile;


public class UpdateUserNameReq {
    private String username;

    public UpdateUserNameReq(String username) {
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}