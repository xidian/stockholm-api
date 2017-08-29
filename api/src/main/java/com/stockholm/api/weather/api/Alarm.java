
package com.stockholm.api.weather.api;

public class Alarm {

    /**
     * standard :
     * icon_big : http://static.etouch.cn/weather/alarm_icon/big/rainstorm_2@3x.png
     * suggestion :
     * pub_time : 2017-08-29 13:35:00
     * degree : 黄色
     * icon : http://static.etouch.cn/weather/alarm_icon/small/rainstorm_2@3x.png
     * city_range : 101020100
     * location : 上海市
     * details : 上海市气象台发布暴雨黄色预警
     * type : 暴雨
     * desc : 上海中心气象台2017年08月29日13时35分发布暴雨黄色预警[Ⅲ级/较重]：受较强的降水云团影响，预计未来6小时内崇明、嘉定、青浦、松江、金山等地有短时强降水，小时雨量30-50毫米，请加强防范。
     */

    private String standard;
    private String icon_big;
    private String suggestion;
    private String pub_time;
    private String degree;
    private String icon;
    private String city_range;
    private String location;
    private String details;
    private String type;
    private String desc;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getIcon_big() {
        return icon_big;
    }

    public void setIcon_big(String icon_big) {
        this.icon_big = icon_big;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getPub_time() {
        return pub_time;
    }

    public void setPub_time(String pub_time) {
        this.pub_time = pub_time;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCity_range() {
        return city_range;
    }

    public void setCity_range(String city_range) {
        this.city_range = city_range;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
