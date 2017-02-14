
package com.stockholm.api.weather;

import java.util.HashMap;
import java.util.Map;

public class Observe {

    private String shidu;
    private Integer temp;
    private String wp;
    private String wd;
    private String tigan;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getTigan() {
        return tigan;
    }

    public void setTigan(String tigan) {
        this.tigan = tigan;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
