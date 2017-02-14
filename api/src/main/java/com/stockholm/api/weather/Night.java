
package com.stockholm.api.weather;

import java.util.HashMap;
import java.util.Map;

public class Night {

    private String wthr;
    private String bgPic;
    private String wp;
    private String notice;
    private Integer type;
    private String wd;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getWthr() {
        return wthr;
    }

    public void setWthr(String wthr) {
        this.wthr = wthr;
    }

    public String getBgPic() {
        return bgPic;
    }

    public void setBgPic(String bgPic) {
        this.bgPic = bgPic;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
