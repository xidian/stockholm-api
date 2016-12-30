package com.stockholm.api.setting.news;

import java.util.List;

public class SetChannelReq {

    private ConfigBean config;

    public SetChannelReq(List<Integer> channel){
        setConfig(new ConfigBean(channel));
    }

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public static class ConfigBean {
        private List<Integer> channel;

        public ConfigBean(List<Integer> channel){
            setChannel(channel);
        }

        public List<Integer> getChannel() {
            return channel;
        }

        public void setChannel(List<Integer> channel) {
            this.channel = channel;
        }
    }
}
