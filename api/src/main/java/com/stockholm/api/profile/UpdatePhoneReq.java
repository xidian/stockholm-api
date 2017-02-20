package com.stockholm.api.profile;


public class UpdatePhoneReq {
    private String code;
    private String phoneNumber;

    public UpdatePhoneReq(String code, String phoneNumber) {
        setCode(code);
        setPhoneNumber(phoneNumber);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}