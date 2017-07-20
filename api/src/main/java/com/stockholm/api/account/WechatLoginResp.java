package com.stockholm.api.account;

public class WechatLoginResp {

    /**
     * errorCode : 0
     * data : {"wechat":{"nickname":"asdfassdf","unionId":"asdfassdf","avatarUrl":"http://xx/xx.jpg"}}
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
         * wechat : {"nickname":"asdfassdf","unionId":"asdfassdf","avatarUrl":"http://xx/xx.jpg"}
         */
        private UserBean userBean;
        private WechatBean wechat;
        private String accessToken;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public WechatBean getWechat() {
            return wechat;
        }

        public void setWechat(WechatBean wechat) {
            this.wechat = wechat;
        }

        public UserBean getUserBean() {
            return userBean;
        }

        public void setUserBean(UserBean userBean) {
            this.userBean = userBean;
        }
    }
}
