package com.stockholm.api.account;

public class LoginResp {

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
         * accessToken : xzXdQL78EPXo1TSp7aDhqAT4
         * user : {"username":"小喵用户5657848","phoneNumber":"13072978353","avatarUrl":null,"wechatNickname":null}
         */

        private String accessToken;
        private UserBean user;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

    }
}