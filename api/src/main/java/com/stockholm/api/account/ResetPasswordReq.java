package com.stockholm.api.account;

public class ResetPasswordReq {

    public ResetPasswordReq(String password, VerificationBean verification) {
        this.password = password;
        this.verification = verification;
    }

    private String password;
    private VerificationBean verification;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VerificationBean getVerification() {
        return verification;
    }

    public void setVerification(VerificationBean verification) {
        this.verification = verification;
    }

    public static class VerificationBean {

        private String phoneNumber;
        private String code;

        public VerificationBean(String phoneNumber, String code) {
            this.phoneNumber = phoneNumber;
            this.code = code;
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

}