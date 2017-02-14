
package com.stockholm.api.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Weather {

    private String desc;
    private Integer status;
    private Data data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public boolean isOk() {
        return desc.equals("OK") && status == 1000;
    }

    public int getTemperature() {
        return data.getObserve().getTemp();
    }

    public void setTemperature(int temperature) {
        data.getObserve().setTemp(temperature);
    }

    public Forecast getTodayForcast() {
        return data.getForecast().get(1);
    }

    public Forecast getYesterdayForcast() {
        return data.getForecast().get(0);
    }

    public Forecast getTomorrowForcast() {
        return data.getForecast().get(2);
    }

    public Forecast getAfterTomorrowForcast() {
        return data.getForecast().get(3);
    }

    public String getWind() {
        return data.getObserve().getWd() + data.getObserve().getWp();
    }

    public String getHumidity() {
        return data.getObserve().getShidu();
    }

    public String getUltravioletRays() {
        for (Index index : data.getIndexes()) {
            if (index.getName().contains("紫外线")) {
                return index.getValue();
            }
        }

        return "--";
    }

    public Weather getTestTodayWeather(String weatherDescription, int temperature, String tigan, int highTemperature, int lowTemperature, String quality, String windDirection, String windStrength, String shidu) {
        Weather newWeathers = new Weather();

        List<Forecast> forecasts = new ArrayList<>();
        forecasts.addAll(data.getForecast());
        forecasts.remove(1);

        Forecast todayForecast = new Forecast();
        todayForecast.setHigh(highTemperature);
        todayForecast.setLow(lowTemperature);
        Day day = new Day();
        day.setWthr(weatherDescription);
        todayForecast.setDay(day);

        Night night = new Night();
        night.setWthr(weatherDescription);
        todayForecast.setNight(night);

        forecasts.add(1, todayForecast);

        Data data = new Data();
        newWeathers.setData(data);

        newWeathers.data.setForecast(forecasts);

        Observe observe = new Observe();
        observe.setWd(windDirection);
        observe.setWp(windStrength);
        observe.setTemp(temperature);
        observe.setTigan(tigan);
        observe.setShidu(shidu);
        newWeathers.getData().setObserve(observe);

        Evn evn = new Evn();
        evn.setQuality(quality);
        newWeathers.getData().setEvn(evn);

        return newWeathers;
    }
}
