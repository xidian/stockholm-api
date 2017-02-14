
package com.stockholm.api.weather;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "shidu",
    "temp",
    "wp",
    "wd",
    "tigan"
})
public class Observe {

    @JsonProperty("shidu")
    private String shidu;
    @JsonProperty("temp")
    private Integer temp;
    @JsonProperty("wp")
    private String wp;
    @JsonProperty("wd")
    private String wd;
    @JsonProperty("tigan")
    private String tigan;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The shidu
     */
    @JsonProperty("shidu")
    public String getShidu() {
        return shidu;
    }

    /**
     * 
     * @param shidu
     *     The shidu
     */
    @JsonProperty("shidu")
    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    /**
     * 
     * @return
     *     The temp
     */
    @JsonProperty("temp")
    public Integer getTemp() {
        return temp;
    }

    /**
     * 
     * @param temp
     *     The temp
     */
    @JsonProperty("temp")
    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    /**
     * 
     * @return
     *     The wp
     */
    @JsonProperty("wp")
    public String getWp() {
        return wp;
    }

    /**
     * 
     * @param wp
     *     The wp
     */
    @JsonProperty("wp")
    public void setWp(String wp) {
        this.wp = wp;
    }

    /**
     * 
     * @return
     *     The wd
     */
    @JsonProperty("wd")
    public String getWd() {
        return wd;
    }

    /**
     * 
     * @param wd
     *     The wd
     */
    @JsonProperty("wd")
    public void setWd(String wd) {
        this.wd = wd;
    }

    /**
     * 
     * @return
     *     The tigan
     */
    @JsonProperty("tigan")
    public String getTigan() {
        return tigan;
    }

    /**
     * 
     * @param tigan
     *     The tigan
     */
    @JsonProperty("tigan")
    public void setTigan(String tigan) {
        this.tigan = tigan;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
