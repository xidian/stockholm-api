package com.stockholm.api.setting.music;

import com.google.gson.Gson;

public class MusicControlBean {

    private int action;
    private int playType;
    private int playState;
    private int playMode;
    private String songId;
    private String radioId;
    private String singerId;

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

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public int getPlayMode() {
        return playMode;
    }

    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }

    public void setRadioId(String radioId) {
        this.radioId = radioId;
    }

    public String getRadioId() {
        return radioId;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public String getSingerId() {
        return singerId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static MusicControlBean get(String json) {
        return new Gson().fromJson(json, MusicControlBean.class);
    }

}