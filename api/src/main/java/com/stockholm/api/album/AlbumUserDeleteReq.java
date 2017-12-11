package com.stockholm.api.album;

public class AlbumUserDeleteReq {

    private String key;

    public AlbumUserDeleteReq(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}