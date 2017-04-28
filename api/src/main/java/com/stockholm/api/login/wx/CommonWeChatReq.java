package com.stockholm.api.login.wx;


public class CommonWeChatReq {
    private String code;

    public CommonWeChatReq(String code) {
        setCode(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}