package com.stockholm.api.setting.fm;

public class SubscribeAlbumReq {


    /**
     * album : {"albumId":123123,"title":"楚老湿大课堂","coverUrl":"example.com/haha.png"}
     */

    private AlbumBean album;

    public AlbumBean getAlbum() {
        return album;
    }

    public void setAlbum(AlbumBean album) {
        this.album = album;
    }

    public static class AlbumBean {
        /**
         * albumId : 123123
         * title : 楚老湿大课堂
         * coverUrl : example.com/haha.png
         */

        private int albumId;
        private String title;
        private String coverUrl;
        private String anchor;

        public int getAlbumId() {
            return albumId;
        }

        public void setAlbumId(int albumId) {
            this.albumId = albumId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public void setAnchor(String anchor) {
            this.anchor = anchor;
        }

        public String getAnchor() {
            return anchor;
        }
    }
}
