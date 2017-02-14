
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
    "mp",
    "co",
    "time",
    "so2",
    "o3",
    "no2",
    "aqi",
    "quality",
    "pm10",
    "pm25",
    "suggest"
})
public class Evn {

    @JsonProperty("mp")
    private String mp;
    @JsonProperty("co")
    private Integer co;
    @JsonProperty("time")
    private String time;
    @JsonProperty("so2")
    private Integer so2;
    @JsonProperty("o3")
    private Integer o3;
    @JsonProperty("no2")
    private Integer no2;
    @JsonProperty("aqi")
    private Integer aqi;
    @JsonProperty("quality")
    private String quality;
    @JsonProperty("pm10")
    private Integer pm10;
    @JsonProperty("pm25")
    private Integer pm25;
    @JsonProperty("suggest")
    private String suggest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mp
     */
    @JsonProperty("mp")
    public String getMp() {
        return mp;
    }

    /**
     * 
     * @param mp
     *     The mp
     */
    @JsonProperty("mp")
    public void setMp(String mp) {
        this.mp = mp;
    }

    /**
     * 
     * @return
     *     The co
     */
    @JsonProperty("co")
    public Integer getCo() {
        return co;
    }

    /**
     * 
     * @param co
     *     The co
     */
    @JsonProperty("co")
    public void setCo(Integer co) {
        this.co = co;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The so2
     */
    @JsonProperty("so2")
    public Integer getSo2() {
        return so2;
    }

    /**
     * 
     * @param so2
     *     The so2
     */
    @JsonProperty("so2")
    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    /**
     * 
     * @return
     *     The o3
     */
    @JsonProperty("o3")
    public Integer getO3() {
        return o3;
    }

    /**
     * 
     * @param o3
     *     The o3
     */
    @JsonProperty("o3")
    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    /**
     * 
     * @return
     *     The no2
     */
    @JsonProperty("no2")
    public Integer getNo2() {
        return no2;
    }

    /**
     * 
     * @param no2
     *     The no2
     */
    @JsonProperty("no2")
    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    /**
     * 
     * @return
     *     The aqi
     */
    @JsonProperty("aqi")
    public Integer getAqi() {
        return aqi;
    }

    /**
     * 
     * @param aqi
     *     The aqi
     */
    @JsonProperty("aqi")
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    /**
     * 
     * @return
     *     The quality
     */
    @JsonProperty("quality")
    public String getQuality() {
        return quality;
    }

    /**
     * 
     * @param quality
     *     The quality
     */
    @JsonProperty("quality")
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * 
     * @return
     *     The pm10
     */
    @JsonProperty("pm10")
    public Integer getPm10() {
        return pm10;
    }

    /**
     * 
     * @param pm10
     *     The pm10
     */
    @JsonProperty("pm10")
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    /**
     * 
     * @return
     *     The pm25
     */
    @JsonProperty("pm25")
    public Integer getPm25() {
        return pm25;
    }

    /**
     * 
     * @param pm25
     *     The pm25
     */
    @JsonProperty("pm25")
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    /**
     * 
     * @return
     *     The suggest
     */
    @JsonProperty("suggest")
    public String getSuggest() {
        return suggest;
    }

    /**
     * 
     * @param suggest
     *     The suggest
     */
    @JsonProperty("suggest")
    public void setSuggest(String suggest) {
        this.suggest = suggest;
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
