package com.stockholm.api.mozik.api;


import java.util.List;

public class MusicListResp extends MozikBaseResp {
    private List<SongBean> music;

    public List<SongBean> getMusic() {
        return music;
    }

    public void setMusic(List<SongBean> music) {
        this.music = music;
    }

}