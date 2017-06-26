package com.stockholm.api.setting.fm;

import com.google.gson.Gson;

public class FmContent {

    private String albumId;

    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static FmContent fromJson(String json) {
        return new Gson().fromJson(json, FmContent.class);
    }
}
