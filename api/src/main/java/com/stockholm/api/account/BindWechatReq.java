package com.stockholm.api.account;

public class BindWechatReq {

    public BindWechatReq(WechatBean wechat) {
        this.wechat = wechat;
    }

    /**
     * wechat : {"code":"code"}
     */

    private WechatBean wechat;

    public WechatBean getWechat() {
        return wechat;
    }

    public void setWechat(WechatBean wechat) {
        this.wechat = wechat;
    }

    public static class WechatBean {

        public WechatBean(String code) {
            this.code = code;
        }

        /**
         * code : code
         */


        private String code;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
