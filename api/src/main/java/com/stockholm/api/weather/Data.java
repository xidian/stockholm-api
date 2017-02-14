
package com.stockholm.api.weather;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "alarm",
    "observe",
    "forecast",
    "indexes",
    "evn",
    "meta"
})
public class Data {

    @JsonProperty("alarm")
    private Alarm alarm;
    @JsonProperty("observe")
    private Observe observe;
    @JsonProperty("forecast")
    private List<Forecast> forecast = new ArrayList<Forecast>();
    @JsonProperty("indexes")
    private List<Index> indexes = new ArrayList<Index>();
    @JsonProperty("evn")
    private Evn evn;
    @JsonProperty("meta")
    private Meta meta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The alarm
     */
    @JsonProperty("alarm")
    public Alarm getAlarm() {
        return alarm;
    }

    /**
     * 
     * @param alarm
     *     The alarm
     */
    @JsonProperty("alarm")
    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    /**
     * 
     * @return
     *     The observe
     */
    @JsonProperty("observe")
    public Observe getObserve() {
        return observe;
    }

    /**
     * 
     * @param observe
     *     The observe
     */
    @JsonProperty("observe")
    public void setObserve(Observe observe) {
        this.observe = observe;
    }

    /**
     * 
     * @return
     *     The forecast
     */
    @JsonProperty("forecast")
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * 
     * @param forecast
     *     The forecast
     */
    @JsonProperty("forecast")
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    /**
     * 
     * @return
     *     The indexes
     */
    @JsonProperty("indexes")
    public List<Index> getIndexes() {
        return indexes;
    }

    /**
     * 
     * @param indexes
     *     The indexes
     */
    @JsonProperty("indexes")
    public void setIndexes(List<Index> indexes) {
        this.indexes = indexes;
    }

    /**
     * 
     * @return
     *     The evn
     */
    @JsonProperty("evn")
    public Evn getEvn() {
        return evn;
    }

    /**
     * 
     * @param evn
     *     The evn
     */
    @JsonProperty("evn")
    public void setEvn(Evn evn) {
        this.evn = evn;
    }

    /**
     * 
     * @return
     *     The meta
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
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
