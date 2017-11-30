package com.stockholm.api.mozik.config;


import com.stockholm.api.mozik.api.WallpaperBean;

public class UpdateWallpaperReq {
    private UpdateBean mozik;

    public UpdateWallpaperReq(WallpaperBean wallpaperBean) {
        this.mozik = new UpdateBean(wallpaperBean);
    }

    public UpdateBean getMozik() {
        return mozik;
    }

    public void setMozik(UpdateBean mozik) {
        this.mozik = mozik;
    }

    public static class UpdateBean {
        private WallpaperBean wallpaper;

        public UpdateBean(WallpaperBean wallpaper) {
            this.wallpaper = wallpaper;
        }

        public WallpaperBean getWallpaper() {
            return wallpaper;
        }

        public void setWallpaper(WallpaperBean wallpaper) {
            this.wallpaper = wallpaper;
        }
    }

}