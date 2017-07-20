package com.stockholm.api.account;

public class UserBean {

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
