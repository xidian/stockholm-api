package com.stockholm.api.setting.clock;


import java.util.List;

public class GetClockSkinsResp {
    private boolean success;
    private String msg;
    private List<ClockThemeBean> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ClockThemeBean> getData() {
        return data;
    }

    public void setData(List<ClockThemeBean> data) {
        this.data = data;
    }

    public static class ClockThemeBean {
        private long themeId;
        private String name;
        private String packageName;
        private String url;
        private String gifUrl;

        public long getThemeId() {
            return themeId;
        }

        public void setThemeId(long id) {
            this.themeId = id;
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

}