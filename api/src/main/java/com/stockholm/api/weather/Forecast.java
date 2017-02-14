
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
    "sunset",
    "night",
    "day",
    "high",
    "sunrise",
    "low",
    "date"
})
public class Forecast {

    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("night")
    private Night night;
    @JsonProperty("day")
    private Day day;
    @JsonProperty("high")
    private Integer high;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("low")
    private Integer low;
    @JsonProperty("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sunset
     */
    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    /**
     * 
     * @param sunset
     *     The sunset
     */
    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    /**
     * 
     * @return
     *     The night
     */
    @JsonProperty("night")
    public Night getNight() {
        return night;
    }

    /**
     * 
     * @param night
     *     The night
     */
    @JsonProperty("night")
    public void setNight(Night night) {
        this.night = night;
    }

    /**
     * 
     * @return
     *     The day
     */
    @JsonProperty("day")
    public Day getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    @JsonProperty("day")
    public void setDay(Day day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The high
     */
    @JsonProperty("high")
    public Integer getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    @JsonProperty("high")
    public void setHigh(Integer high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The sunrise
     */
    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    /**
     * 
     * @param sunrise
     *     The sunrise
     */
    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * 
     * @return
     *     The low
     */
    @JsonProperty("low")
    public Integer getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    @JsonProperty("low")
    public void setLow(Integer low) {
        this.low = low;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
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
