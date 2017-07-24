package com.stockholm.api.account;

public class RegisterResp {


    /**
     * errorCode : 0
     * data : {"user":{"username":"adfasd","phoneNumber":"78987898789","avatarUrl":"http://asdf.com/asdf.jpg","wechatNickname":"asdasg"},"accessToken":"adfadfad"}
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
         * user : {"username":"adfasd","phoneNumber":"78987898789","avatarUrl":"http://asdf.com/asdf.jpg","wechatNickname":"asdasg"}
         * accessToken : adfadfad
         */

        private UserBean user;
        private String accessToken;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

    }
}