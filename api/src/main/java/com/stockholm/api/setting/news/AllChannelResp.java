package com.stockholm.api.setting.news;

import java.util.List;

public class AllChannelResp {

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

        private int id;
        private String name;
        private String icon;
        private ConfigBean config;
        private AvailableConfigBean available_config;

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

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public ConfigBean getConfig() {
            return config;
        }

        public void setConfig(ConfigBean config) {
            this.config = config;
        }

        public AvailableConfigBean getAvailable_config() {
            return available_config;
        }

        public void setAvailable_config(AvailableConfigBean available_config) {
            this.available_config = available_config;
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

        public static class AvailableConfigBean {
            private List<ChannelsBean> channels;

            public List<ChannelsBean> getChannels() {
                return channels;
            }

            public void setChannels(List<ChannelsBean> channels) {
                this.channels = channels;
            }

            public static class ChannelsBean {

                private int categoryId;
                private String categoryName;

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public String getCategoryName() {
                    return categoryName;
                }

                public void setCategoryName(String categoryName) {
                    this.categoryName = categoryName;
                }
            }
        }
    }
}
