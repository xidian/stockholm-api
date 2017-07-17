package com.stockholm.api.account;

public class ResetPwdReq {

    private String phoneNumber;
    private String password;
    private String code;

    public ResetPwdReq(String phoneNumber, String password, String code) {
        setPhoneNumber(phoneNumber);
        setPassword(password);
        setCode(code);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
