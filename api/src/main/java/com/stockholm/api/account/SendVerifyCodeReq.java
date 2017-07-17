package com.stockholm.api.account;

public class SendVerifyCodeReq {

    public SendVerifyCodeReq(String phoneNumber, int type) {
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    /**
     * phoneNumber : 78987898789
     * type : 0
     */

    private String phoneNumber;
    private int type;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
