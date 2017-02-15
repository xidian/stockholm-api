package com.stockholm.api.weather.config;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class WeatherConfig {

    private List<CityBean> cityBeanList = new ArrayList<>();

    public WeatherConfig() {

    }

    public List<CityBean> getCityBeanList() {
        return cityBeanList;
    }

    public boolean addCityBean(CityBean bean) {
        if (bean == null) return false;
        if (!cityBeanList.contains(bean)) {
            cityBeanList.add(bean);
            return true;
        }

        return false;
    }

    public boolean removeCityBean(CityBean bean) {
        return cityBeanList.remove(bean);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static WeatherConfig get(String json) {
        return new Gson().fromJson(json, WeatherConfig.class);
    }
}
