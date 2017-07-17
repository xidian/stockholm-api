package com.stockholm.api.account;


public class CheckSerialNumberReq {
    private String phoneNumber;

    public CheckSerialNumberReq(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}