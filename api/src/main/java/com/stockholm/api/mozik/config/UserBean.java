package com.stockholm.api.mozik.config;


public class UserBean {
    private int userId;

    public UserBean() {
    }

    public UserBean(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}