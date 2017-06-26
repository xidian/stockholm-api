package com.stockholm.api.setting.fm;

public class CurrentTrackResp {


    /**
     * success : true
     * msg : 您当前的播放记录
     * data : {"playState":1,"title":"hjhhj","subTitle":"ghjh","coverImg":"hh.com","extra":null}
     */

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
        /**
         * playState : 1
         * title : hjhhj
         * subTitle : ghjh
         * coverImg : hh.com
         * extra : null
         */

        private int playState;
        private String title;
        private String subTitle;
        private String coverImg;
        private Object extra;

        public int getPlayState() {
            return playState;
        }

        public void setPlayState(int playState) {
            this.playState = playState;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getCoverImg() {
            return coverImg;
        }

        public void setCoverImg(String coverImg) {
            this.coverImg = coverImg;
        }

        public Object getExtra() {
            return extra;
        }

        public void setExtra(Object extra) {
            this.extra = extra;
        }
    }
}
