package com.stockholm.api.mozik.api;


public class SongUrlResp extends MozikBaseResp {
    private String url;
    private SongBean music;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SongBean getMusic() {
        return music;
    }

    public void setMusic(SongBean music) {
        this.music = music;
    }

    public String getId() {
        return music.getId();
    }

}