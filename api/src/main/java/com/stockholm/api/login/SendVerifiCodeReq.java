package com.stockholm.api.login;

public class SendVerifiCodeReq {

    private String phoneNumber;

    private int flag;

    public SendVerifiCodeReq(String phone, int flag) {
        setPhoneNumber(phone);
        setRegister(flag);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRegister(int register) {
        this.flag = register;
    }

    public int isRegister() {
        return flag;
    }
}
