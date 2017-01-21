package com.stockholm.api.setting.clock;


import java.util.ArrayList;
import java.util.List;

public class GetClockSkinsResp {
    private boolean success;
    private String msg;
    private List<ClockSkinBean> data = new ArrayList();

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

    public List<ClockSkinBean> getData() {
        return data;
    }

    public void setData(List<ClockSkinBean> data) {
        this.data = data;
    }

    public static class ClockSkinBean {
        private int id;
        private String name;
        private String packageName;
        private String url;

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

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ClockSkinBean) {
                if (((ClockSkinBean) obj).getId() == id) {
                    return true;
                }
            }
            return false;
        }
    }
}
