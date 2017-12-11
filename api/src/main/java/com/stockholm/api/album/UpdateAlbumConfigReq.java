package com.stockholm.api.album;


public class UpdateAlbumConfigReq {

    private AlbumConfigBean album;

    public UpdateAlbumConfigReq(AlbumConfigBean album) {
        this.album = album;
    }

    public AlbumConfigBean getAlbum() {
        return album;
    }

    public void setAlbum(AlbumConfigBean album) {
        this.album = album;
    }

}