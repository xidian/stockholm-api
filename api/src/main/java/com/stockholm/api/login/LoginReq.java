package com.stockholm.api.login;

public class LoginReq {

    private UserBean user;
    private DeviceBean device;

    public LoginReq(String phoneNumber, String pwd, String pushToken, int platfrom) {
        setDevice(new DeviceBean(pushToken, platfrom));
        setUser(new UserBean(phoneNumber, pwd));
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

    public static class UserBean {

        private String phoneNumber;
        private String password;

        UserBean(String phoneNumber, String pwd) {
            setPhoneNumber(phoneNumber);
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

        public String getPushToken() {
            return pushToken;
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
