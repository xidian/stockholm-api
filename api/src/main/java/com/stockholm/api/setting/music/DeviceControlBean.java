package com.stockholm.api.setting.music;

import com.google.gson.Gson;

public class DeviceControlBean {

    private int action;
    private int playType;
    private int playState;
    private String playId;
    private int playMode;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getPlayType() {
        return playType;
    }

    public void setPlayType(int playType) {
        this.playType = playType;
    }

    public int getPlayState() {
        return playState;
    }

    public void setPlayState(int playState) {
        this.playState = playState;
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public int getPlayMode() {
        return playMode;
    }

    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static DeviceControlBean get(String json) {
        return new Gson().fromJson(json, DeviceControlBean.class);
    }

}