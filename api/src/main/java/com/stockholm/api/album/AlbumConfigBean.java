package com.stockholm.api.album;


import com.google.gson.Gson;

public class AlbumConfigBean {

    private boolean showTime;
    private boolean autoPlay;

    public boolean isShowTime() {
        return showTime;
    }

    public void setShowTime(boolean showTime) {
        this.showTime = showTime;
    }

    public boolean isAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static AlbumConfigBean get(String json) {
        return new Gson().fromJson(json, AlbumConfigBean.class);
    }

}