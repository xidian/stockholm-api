package com.stockholm.api.mozik.config;


import com.stockholm.api.mozik.api.WallpaperBean;

public class UpdateWallpaperReq {

    private WallpaperBean mozik;

    public UpdateWallpaperReq(WallpaperBean mozik) {
        this.mozik = mozik;
    }

    public WallpaperBean getMozik() {
        return mozik;
    }

    public void setMozik(WallpaperBean mozik) {
        this.mozik = mozik;
    }

}