package com.stockholm.api.account;

public class LoginReq {

    public LoginReq(UserBean user, DeviceBean device, WechatBean wechat) {
        this.user = user;
        this.device = device;
        this.wechat = wechat;
    }

    /**
     * user : {"phoneNumber":"1828485744","password":"password"}
     * device : {"serialNumber":"aasdfasdf","pushToken":"asdfasg"}
     * wechat : {"nickname":"asdf","avatarUrl":"http://xxx/xxx.jpg","unionId":"asdfg234"}
     */

    private UserBean user;
    private DeviceBean device;
    private WechatBean wechat;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
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
         * phoneNumber : 1828485744
         * password : password
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
         * serialNumber : aasdfasdf
         * pushToken : asdfasg
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

}