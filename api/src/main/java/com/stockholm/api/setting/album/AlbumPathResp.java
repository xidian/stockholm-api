package com.stockholm.api.setting.album;

import java.util.List;

public class AlbumPathResp {

    private ConfigBean config;
    private List<String> downloadUrls;

    public ConfigBean getConfig() {
        return config;
    }

    public void setConfig(ConfigBean config) {
        this.config = config;
    }

    public List<String> getDownloadUrls() {
        return downloadUrls;
    }

    public void setDownloadUrls(List<String> downloadUrls) {
        this.downloadUrls = downloadUrls;
    }

    public static class ConfigBean {

        private boolean showTime;
        private boolean translation;
        private boolean autoPlay;
        private int playInterval;

        public boolean isShowTime() {
            return showTime;
        }

        public void setShowTime(boolean showTime) {
            this.showTime = showTime;
        }

        public boolean isTranslation() {
            return translation;
        }

        public void setTranslation(boolean translation) {
            this.translation = translation;
        }

        public boolean isAutoPlay() {
            return autoPlay;
        }

        public void setAutoPlay(boolean autoPlay) {
            this.autoPlay = autoPlay;
        }

        public int getPlayInterval() {
            return playInterval;
        }

        public void setPlayInterval(int playInterval) {
            this.playInterval = playInterval;
        }
    }
}
