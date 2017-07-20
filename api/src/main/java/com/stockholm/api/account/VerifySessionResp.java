package com.stockholm.api.account;

public class VerifySessionResp {


    /**
     * errorCode : 0
     * data : {"session":true}
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
         * session : true
         */

        private boolean session;

        public boolean isSession() {
            return session;
        }

        public void setSession(boolean session) {
            this.session = session;
        }
    }
}
