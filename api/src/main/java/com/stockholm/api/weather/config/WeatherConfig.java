package com.stockholm.api.weather.config;


import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class WeatherConfig {

    private String cities;
    private String alert;

    public WeatherConfig() {

    }

    public AlertBean getAlertBean() {
        if (TextUtils.isEmpty(alert)) return new AlertBean();
        return AlertBean.get(alert);
    }

    public void setAlertBean(AlertBean alertBean) {
        this.alert = alertBean.toString();
    }

    public void setCities(List<CityBean> cities) {
        this.cities = new Gson().toJson(cities);
    }

    public List<CityBean> getCityBeanList() {
        if (TextUtils.isEmpty(cities)) return new ArrayList<>();
        return new Gson().fromJson(cities, new TypeToken<List<CityBean>>() {
        }.getType());
    }

    public boolean addCityBean(CityBean bean) {
        if (bean == null) return false;
        List<CityBean> cityBeanList = getCityBeanList();
        if (!cityBeanList.contains(bean)) {
            if (cityBeanList.isEmpty()) {
                cityBeanList.add(bean);
            } else {
                CityBean location = cityBeanList.get(0);
                if (location != null && location.isLocation()) {
                    cityBeanList.add(1, bean);
                } else {
                    cityBeanList.add(0, bean);
                }
            }
            setCities(cityBeanList);
            return true;
        }

        return false;
    }

    public boolean removeCityBean(CityBean bean) {
        List<CityBean> cityBeanList = getCityBeanList();
        cityBeanList.remove(bean);
        setCities(cityBeanList);
        return true;
    }

    public CityBean getLocationCity() {
        for (CityBean cityBean : getCityBeanList()) {
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
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(this);
    }

    public static WeatherConfig get(String json) {
        return new Gson().fromJson(json, WeatherConfig.class);
    }

}