
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
    "icon",
    "pub_time",
    "degree",
    "desc",
    "details",
    "standard",
    "location",
    "suggestion",
    "city_range",
    "type"
})
public class Alarm {

    @JsonProperty("icon")
    private String icon;
    @JsonProperty("pub_time")
    private String pubTime;
    @JsonProperty("degree")
    private String degree;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("details")
    private String details;
    @JsonProperty("standard")
    private String standard;
    @JsonProperty("location")
    private String location;
    @JsonProperty("suggestion")
    private String suggestion;
    @JsonProperty("city_range")
    private String cityRange;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The icon
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 
     * @return
     *     The pubTime
     */
    @JsonProperty("pub_time")
    public String getPubTime() {
        return pubTime;
    }

    /**
     * 
     * @param pubTime
     *     The pub_time
     */
    @JsonProperty("pub_time")
    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    /**
     * 
     * @return
     *     The degree
     */
    @JsonProperty("degree")
    public String getDegree() {
        return degree;
    }

    /**
     * 
     * @param degree
     *     The degree
     */
    @JsonProperty("degree")
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 
     * @return
     *     The desc
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * 
     * @param desc
     *     The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 
     * @return
     *     The details
     */
    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    /**
     * 
     * @param details
     *     The details
     */
    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * 
     * @return
     *     The standard
     */
    @JsonProperty("standard")
    public String getStandard() {
        return standard;
    }

    /**
     * 
     * @param standard
     *     The standard
     */
    @JsonProperty("standard")
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The suggestion
     */
    @JsonProperty("suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * 
     * @param suggestion
     *     The suggestion
     */
    @JsonProperty("suggestion")
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * 
     * @return
     *     The cityRange
     */
    @JsonProperty("city_range")
    public String getCityRange() {
        return cityRange;
    }

    /**
     * 
     * @param cityRange
     *     The city_range
     */
    @JsonProperty("city_range")
    public void setCityRange(String cityRange) {
        this.cityRange = cityRange;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
