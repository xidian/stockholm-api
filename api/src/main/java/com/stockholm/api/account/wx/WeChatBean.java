package com.stockholm.api.account.wx;


import com.google.gson.Gson;

import java.io.Serializable;

public class WeChatBean implements Serializable {
    private String nickname;
    private String headimgurl;
    private String unionid;

    public WeChatBean(String nickname, String headimgurl, String unionid) {
        setNickname(nickname);
        setHeadImgUrl(headimgurl);
        setUnionId(unionid);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headimgurl = headImgUrl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionId(String unionId) {
        this.unionid = unionId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static WeChatBean get(String json) {
        return new Gson().fromJson(json, WeChatBean.class);
    }

}