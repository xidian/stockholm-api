package com.stockholm.api.weather.config;


import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class WeatherConfig {

    private List<CityBean> cities = new ArrayList<>();
    private AlertBean alertBean;

    public WeatherConfig() {

    }

    public AlertBean getAlertBean() {
        return alertBean;
    }

    public void setAlertBean(AlertBean alertBean) {
        this.alertBean = alertBean;
    }

    public List<CityBean> getCities() {
        return cities;
    }

    public boolean addCityBean(CityBean bean) {
        if (bean == null) return false;
        if (!cities.contains(bean)) {
            cities.add(bean);
            return true;
        }

        return false;
    }

    public boolean removeCityBean(CityBean bean) {
        return cities.remove(bean);
    }

    public CityBean getLocationCity() {
        for (CityBean cityBean: cities) {
            if (cityBean.isLocation()) return cityBean;
        }

        return null;
    }

    public boolean setLocationCityVisible(boolean visible) {
        CityBean cityBean = getLocationCity();
        if (cityBean != null) {
            cityBean.setVisible(visible);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static WeatherConfig get(String json) {
        return new Gson().fromJson(json, WeatherConfig.class);
    }

}