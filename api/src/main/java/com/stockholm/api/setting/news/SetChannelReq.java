package com.stockholm.api.setting.news;

import java.util.List;

public class SetChannelReq {

    private ConfigBean config;

    public SetChannelReq(List<ConfigBean.ChannelBean> channel) {
        setConfig(new ConfigBean(channel));
    }

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public static class ConfigBean {
        private List<ChannelBean> channel;

        public ConfigBean(List<ChannelBean> channel) {
            setChannel(channel);
        }

        public List<ChannelBean> getChannel() {
            return channel;
        }

        public void setChannel(List<ChannelBean> channel) {
            this.channel = channel;
        }

        public static class ChannelBean {

            private int id;
            private String name;

            public ChannelBean(int id, String name) {
                setId(id);
                setName(name);
            }

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
        }
    }
}
