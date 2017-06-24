package com.stockholm.api.setting.news;


public class NewsUpdateRecordReq {

    private NewsRecord record;

    public NewsUpdateRecordReq(NewsRecord record) {
        this.record = record;
    }

    public NewsRecord getRecord() {
        return record;
    }

    public void setRecord(NewsRecord record) {
        this.record = record;
    }

    public static class NewsRecord {
        private long newsId;
        private int playState;
        private String extra;

        public long getNewsId() {
            return newsId;
        }

        public void setNewsId(long newsId) {
            this.newsId = newsId;
        }

        public int getPlayState() {
            return playState;
        }

        public void setPlayState(int playState) {
            this.playState = playState;
        }

        public String getExtra() {
            return extra;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }
    }

}