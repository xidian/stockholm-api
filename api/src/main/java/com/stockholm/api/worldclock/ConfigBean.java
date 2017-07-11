package com.stockholm.api.worldclock;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class ConfigBean {
    private String cities;

    public ConfigBean(List<CityBean> cityList) {
        setCities(cityList);
    }

    public List<CityBean> getCities() {
        return new Gson().fromJson(cities, new TypeToken<List<CityBean>>() {
        }.getType());
    }

    public void setCities(List<CityBean> cityList) {
        this.cities = new Gson().toJson(cityList);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static ConfigBean get(String json) {
        return new Gson().fromJson(json, ConfigBean.class);
    }

}