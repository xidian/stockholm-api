package com.stockholm.api.account;

public class VerifyPasswordResp {

    /**
     * errorCode : 0
     * data : {"password":true}
     */

    private int errorCode;
    private DataBean data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * password : true
         */

        private boolean password;

        public boolean isPassword() {
            return password;
        }

        public void setPassword(boolean password) {
            this.password = password;
        }
    }
}
