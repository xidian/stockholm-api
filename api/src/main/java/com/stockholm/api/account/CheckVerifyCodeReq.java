package com.stockholm.api.account;

public class CheckVerifyCodeReq {

    public CheckVerifyCodeReq(VerificationBean verification) {
        this.verification = verification;
    }

    /**
     * verification : {"phoneNumber":"433524234","code":1231}
     */

    private VerificationBean verification;

    public VerificationBean getVerification() {
        return verification;
    }

    public void setVerification(VerificationBean verification) {
        this.verification = verification;
    }

    public static class VerificationBean {

        public VerificationBean(String phoneNumber, String code) {
            this.phoneNumber = phoneNumber;
            this.code = code;
        }

        /**
         * phoneNumber : 433524234
         * code : 1231
         */

        private String phoneNumber;
        private String code;

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
