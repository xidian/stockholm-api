package com.stockholm.api.setting;

/**
 * Created by caorh on 17-3-25.
 */

public class CommonResp {


    /**
     * success : true
     * msg : msg
     */

    private boolean success;
    private String msg;

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
}
