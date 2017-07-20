package com.stockholm.api.account;

public class BindWechatResp {


    /**
     * errorCode : 0
     * data : {"wechatNickname":"hahah","username":"asdfasdf","avatarUrl":"http://xx.xx/xx.jpg"}
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
         * wechatNickname : hahah
         * username : asdfasdf
         * avatarUrl : http://xx.xx/xx.jpg
         */

        private String wechatNickname;
        private String username;
        private String avatarUrl;

        public String getWechatNickname() {
            return wechatNickname;
        }

        public void setWechatNickname(String wechatNickname) {
            this.wechatNickname = wechatNickname;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }
    }
}
