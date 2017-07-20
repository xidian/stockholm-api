package com.stockholm.api.account;

public class UpdatePhoneReq {

    /**
     * phoneNumber : 13576738637
     * password : password
     * verificationCode : 1234
     */

    private String phoneNumber;
    private String password;
    private String verificationCode;

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

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
