package com.stockholm.api.mozik.api;


import com.google.gson.Gson;

public class WallpaperBean {

    private int id;
    private String name;
    private String author;
    private String info;
    private String url;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static WallpaperBean get(String json) {
        return new Gson().fromJson(json, WallpaperBean.class);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WallpaperBean) {
            return id == ((WallpaperBean) obj).getId();
        }
        return false;
    }

}