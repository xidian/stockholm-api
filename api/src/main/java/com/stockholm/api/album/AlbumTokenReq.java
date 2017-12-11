package com.stockholm.api.album;

public class AlbumTokenReq {

    private int count;

    public AlbumTokenReq(int count){
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
