package com.stockholm.api.account;

public class ResetPasswordReq {


    public ResetPasswordReq(String password, VerificationBean verification) {
        this.password = password;
        this.verification = verification;
    }

    /**
     * password : password
     * verification : {"phoneNumer":"13709837763","code":"5678"}
     */


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

        public VerificationBean(String phoneNumer, String code) {
            this.phoneNumer = phoneNumer;
            this.code = code;
        }

        /**
         * phoneNumer : 13709837763
         * code : 5678
         */

        private String phoneNumer;
        private String code;

        public String getPhoneNumer() {
            return phoneNumer;
        }

        public void setPhoneNumer(String phoneNumer) {
            this.phoneNumer = phoneNumer;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
