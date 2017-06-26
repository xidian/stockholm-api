package com.stockholm.api.setting.fm;

import com.google.gson.Gson;

public class FmContent {

    private String trackId;

    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static FmContent fromJson(String json) {
        return new Gson().fromJson(json, FmContent.class);
    }
}
