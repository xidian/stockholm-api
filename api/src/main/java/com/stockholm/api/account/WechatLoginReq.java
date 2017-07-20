package com.stockholm.api.account;

public class WechatLoginReq {

    public WechatLoginReq(UserBean user, DeviceBean device) {
        this.user = user;
        this.device = device;
    }

    /**
     * user : {"wechatCode":"wechatCode"}
     * device : {"serialNumber":"asdfadf","pushToken":"push token"}
     */

    private UserBean user;
    private DeviceBean device;

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

    public static class UserBean {

        public UserBean(String wechatCode) {
            this.wechatCode = wechatCode;
        }

        /**
         * wechatCode : wechatCode
         */



        private String wechatCode;

        public String getWechatCode() {
            return wechatCode;
        }

        public void setWechatCode(String wechatCode) {
            this.wechatCode = wechatCode;
        }
    }

    public static class DeviceBean {

        public DeviceBean(String serialNumber, String pushToken) {
            this.serialNumber = serialNumber;
            this.pushToken = pushToken;
        }

        /**
         * serialNumber : asdfadf
         * pushToken : push token
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
