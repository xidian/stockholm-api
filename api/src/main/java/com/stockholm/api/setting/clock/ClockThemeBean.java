package com.stockholm.api.setting.clock;


public class ClockThemeBean {
    private long themeId;
    private String name;
    private String packageName;
    private String url;
    private String gifUrl;

    public long getThemeId() {
        return themeId;
    }

    public void setThemeId(long themeId) {
        this.themeId = themeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ClockThemeBean) {
            if (((ClockThemeBean) obj).getThemeId() == themeId) {
                return true;
            }
        }
        return false;
    }

}