package com.stockholm.api.login;

public class CheckVerifiCodeReq {

    private String phoneNumber;
    private String code;

    public CheckVerifiCodeReq(String phoneNumber, String code) {
        setPhoneNumber(phoneNumber);
        setCode(code);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
