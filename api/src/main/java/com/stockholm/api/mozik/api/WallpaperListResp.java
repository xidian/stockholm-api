package com.stockholm.api.mozik.api;


import java.util.List;

public class WallpaperListResp extends MozikBaseResp {
    private List<WallpaperBean> imgs;

    public List<WallpaperBean> getImgs() {
        return imgs;
    }

    public void setImgs(List<WallpaperBean> imgs) {
        this.imgs = imgs;
    }

}