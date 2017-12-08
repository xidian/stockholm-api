package com.stockholm.api.weather.config;


import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class WeatherConfig {

    private String alert;
    private String cities;
    private String location;

    public WeatherConfig() {

    }

    public AlertBean getAlertBean() {
        if (TextUtils.isEmpty(alert)) return new AlertBean();
        return AlertBean.get(alert);
    }

    public void setAlertBean(AlertBean alertBean) {
        this.alert = alertBean.toString();
    }

    public CityBean getLocationCity() {
        if (!TextUtils.isEmpty(location)) {
            return CityBean.get(location);
        }
        return null;
    }

    public void setLocationCity(CityBean locationCity) {
        this.location = locationCity.toString();
    }

    public void setCities(List<CityBean> cities) {
        this.cities = new Gson().toJson(cities);
    }

    public List<CityBean> getAllCity() {
        List<CityBean> list = getCityBeanList();
        CityBean locationCity = getLocationCity();
        if (locationCity != null) {
            list.add(0, locationCity);
        }
        return list;
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
            if (cityBeanList.size() == 0) {
                cityBeanList.add(bean);
            } else {
                cityBeanList.add(0, bean);
            }
            setCities(cityBeanList);
            return true;
        }

        return false;
    }

    public boolean removeCityBean(CityBean bean) {
        List<CityBean> cityBeanList = getCityBeanList();
        if (cityBeanList != null && cityBeanList.size() > 0) {
            cityBeanList.remove(bean);
            setCities(cityBeanList);
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