package com.stockholm.api.setting.news;

import java.util.List;

public class SetChannelResp {

    private boolean success;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private int clock_id;
        private int id;
        private ConfigBean config;
        private int app_id;
        private String created_at;
        private String updated_at;

        public int getClock_id() {
            return clock_id;
        }

        public void setClock_id(int clock_id) {
            this.clock_id = clock_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public int getApp_id() {
            return app_id;
        }

        public void setApp_id(int app_id) {
            this.app_id = app_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public static class ConfigBean {
            private List<Integer> channel;

            public List<Integer> getChannel() {
                return channel;
            }

            public void setChannel(List<Integer> channel) {
                this.channel = channel;
            }
        }
    }
}
