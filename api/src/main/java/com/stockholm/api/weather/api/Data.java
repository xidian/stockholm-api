
package com.stockholm.api.weather.api;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private Alarm alarm;
    private Observe observe;
    private List<Forecast> forecast = new ArrayList<Forecast>();
    private List<Index> indexes = new ArrayList<Index>();
    private Evn evn;
    private Meta meta;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Observe getObserve() {
        return observe;
    }

    public void setObserve(Observe observe) {
        this.observe = observe;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public List<Index> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<Index> indexes) {
        this.indexes = indexes;
    }

    public Evn getEvn() {
        return evn;
    }

    public void setEvn(Evn evn) {
        this.evn = evn;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
