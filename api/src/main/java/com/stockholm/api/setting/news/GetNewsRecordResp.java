package com.stockholm.api.setting.news;


import com.stockholm.api.audio.AudioRecord;

public class GetNewsRecordResp {
    private boolean success;
    private String msg;
    private AudioRecord data;

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

    public AudioRecord getData() {
        return data;
    }

    public void setData(AudioRecord data) {
        this.data = data;
    }

}