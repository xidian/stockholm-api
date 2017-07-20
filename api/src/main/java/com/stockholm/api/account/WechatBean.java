package com.stockholm.api.account;

import java.io.Serializable;

public class WechatBean implements Serializable {


    /**
     * nickname : asdfassdf
     * unionId : asdfassdf
     * avatarUrl : http://xx/xx.jpg
     */

    private String nickname;
    private String unionId;
    private String avatarUrl;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }


}
