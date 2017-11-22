package com.stockholm.api.mozik.api;


import java.util.List;

public class CollectionListResp extends MozikBaseResp {
    private int current;
    private int total;
    private List<SongBean> musicList;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<SongBean> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<SongBean> musicList) {
        this.musicList = musicList;
    }

}