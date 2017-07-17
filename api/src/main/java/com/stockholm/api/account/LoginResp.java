package com.stockholm.api.account;

public class LoginResp {


    /**
     * user : {"acountId":"12341","username":"adfasd","phoneNumber":"78987898789","avatarUrl":"http: //asdf.com/asdf.jpg"}
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

    public static class UserBean {
        /**
         * acountId : 12341
         * username : adfasd
         * phoneNumber : 78987898789
         * avatarUrl : http: //asdf.com/asdf.jpg
         */

        private String acountId;
        private String username;
        private String phoneNumber;
        private String avatarUrl;
        private String wechatNickname;

        public String getWechatNickname() {
            return wechatNickname;
        }

        public void setWechatNickname(String wechatNickname) {
            this.wechatNickname = wechatNickname;
        }

        public String getAcountId() {
            return acountId;
        }

        public void setAcountId(String acountId) {
            this.acountId = acountId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }
    }
}