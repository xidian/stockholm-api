package com.stockholm.api.account;

public class RegisterReq {

    private UserBean user;
    private String code;
    private DeviceBean device;
    private WechatBean wechat;

    public RegisterReq( String code, UserBean user,DeviceBean device, WechatBean wechat) {
        this.user = user;
        this.code = code;
        this.device = device;
        this.wechat = wechat;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public WechatBean getWechat() {
        return wechat;
    }

    public void setWechat(WechatBean wechat) {
        this.wechat = wechat;
    }

    public static class UserBean {

        public UserBean(String phoneNumber, String password) {
            this.phoneNumber = phoneNumber;
            this.password = password;
        }

        /**
         * phoneNumber : 12345432
         * password : 13242
         */


        private String phoneNumber;
        private String password;

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class DeviceBean {

        public DeviceBean(String serialNumber, String pushToken) {
            this.serialNumber = serialNumber;
            this.pushToken = pushToken;
        }

        /**
         * serialNumber : uiknbhjfdkmnvhjfdk
         * pushToken : huikuik9i89i
         */

        private String serialNumber;
        private String pushToken;

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getPushToken() {
            return pushToken;
        }

        public void setPushToken(String pushToken) {
            this.pushToken = pushToken;
        }
    }

    public static class WechatBean {

        public WechatBean(String unionId) {
            this.unionId = unionId;
        }

        /**
         * unionId : 7899890
         * avatar : http://asdf.com/asdf.jpg
         * nickname : xxx
         */

        private String unionId;
        private String avatar;
        private String nickname;

        public String getUnionId() {
            return unionId;
        }

        public void setUnionId(String unionId) {
            this.unionId = unionId;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }
}
