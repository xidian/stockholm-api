package com.stockholm.api.account;

import com.stockholm.api.account.wx.WeChatBean;

public class SignReq {

    private UserBean user;
    private DeviceBean device;
    private WeChatBean wechat;
    private String code;

    public SignReq(String phone, String pwd,
                   String pushToken, int platfrom,
                   String code) {
        setDevice(new DeviceBean(pushToken, platfrom));
        setUser(new UserBean(phone, pwd));
        setCode(code);
    }

    public SignReq(String phone, String pwd,
                   String pushToken, int platfrom,
                   String code, WeChatBean wechat) {
        setDevice(new DeviceBean(pushToken, platfrom));
        setUser(new UserBean(phone, pwd));
        setCode(code);
        setWechat(wechat);
    }

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

    public WeChatBean getWechat() {
        return wechat;
    }

    public void setWechat(WeChatBean wechat) {
        this.wechat = wechat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class UserBean {

        private String phoneNumber;
        private String password;

        UserBean(String usn, String pwd) {
            setPhoneNumber(usn);
            setPassword(pwd);
        }

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

        private String pushToken;
        private int platform;

        DeviceBean(String pushToken, int platform) {
            setPlatform(platform);
            setPushToken(pushToken);
        }

        public void setPushToken(String pushToken) {
            this.pushToken = pushToken;
        }

        public int getPlatform() {
            return platform;
        }

        public void setPlatform(int platform) {
            this.platform = platform;
        }
    }

}