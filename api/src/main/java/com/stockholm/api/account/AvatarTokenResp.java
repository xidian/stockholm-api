package com.stockholm.api.account;

public class AvatarTokenResp {


    /**
     * errorCode : 0
     * data : {"key":"idkagasdfx","uptoken":"fyuiopoiugfghjklkjhg"}
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
         * key : idkagasdfx
         * uptoken : fyuiopoiugfghjklkjhg
         */

        private String key;
        private String uptoken;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getUptoken() {
            return uptoken;
        }

        public void setUptoken(String uptoken) {
            this.uptoken = uptoken;
        }
    }
}
