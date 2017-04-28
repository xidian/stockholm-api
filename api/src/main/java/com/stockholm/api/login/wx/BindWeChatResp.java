package com.stockholm.api.login.wx;


public class BindWeChatResp {
    private boolean success;
    private String msg;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String wechatNickname;
        private String username;
        private String avatar;

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

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }

}