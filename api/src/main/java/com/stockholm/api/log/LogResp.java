package com.stockholm.api.log;


public class LogResp {
    /**
     * key : idkagasdfx
     * uptoken : fyuiopoiugfghjklkjhg
     * startDate : 2017-07-10
     * endDate : 2017-07-20
     * packageName : com.stockholm.music
     */
    private String key;
    private String uptoken;
    private String startDate;
    private String endDate;
    private String packageName;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUptoken() {
        return uptoken;
    }

    public void setUptoken(String uptoken) {
        this.uptoken = uptoken;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
