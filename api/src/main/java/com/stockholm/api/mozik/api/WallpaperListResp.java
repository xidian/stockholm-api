package com.stockholm.api.mozik.api;


import java.util.List;

public class WallpaperListResp extends MozikBaseResp {
    private List<WallpaperBean> bgs;

    public List<WallpaperBean> getBgs() {
        return bgs;
    }

    public void setBgs(List<WallpaperBean> bgs) {
        this.bgs = bgs;
    }

}