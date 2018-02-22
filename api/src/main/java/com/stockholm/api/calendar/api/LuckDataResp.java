package com.stockholm.api.calendar.api;

public class LuckDataResp {

    private String code;
    private LuckyBean data;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LuckyBean getData() {
        return data;
    }

    public void setData(LuckyBean data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static class LuckyBean {
        private int LoveIndex = 5;
        private int WorkingIndex = 5;
        private int ComprehensiveIndex = 5;

        public int getLoveIndex() {
            return LoveIndex;
        }

        public void setLoveIndex(int loveIndex) {
            LoveIndex = loveIndex;
        }

        public int getWorkingIndex() {
            return WorkingIndex;
        }

        public void setWorkingIndex(int workingIndex) {
            WorkingIndex = workingIndex;
        }

        public int getComprehensiveIndex() {
            return ComprehensiveIndex;
        }

        public void setComprehensiveIndex(int comprehensiveIndex) {
            ComprehensiveIndex = comprehensiveIndex;
        }
    }

}