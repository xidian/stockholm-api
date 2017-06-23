package com.stockholm.api.audio;


import com.google.gson.Gson;

public class AudioRecord {
    private int playState;
    private String title;
    private String subTitle;
    private String coverImg;
    private String extra;

    public int getPlayState() {
        return playState;
    }

    public void setPlayState(int playState) {
        this.playState = playState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AudioRecord get(String json) {
        return new Gson().fromJson(json, AudioRecord.class);
    }

}