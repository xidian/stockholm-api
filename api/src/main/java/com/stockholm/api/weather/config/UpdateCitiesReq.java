package com.stockholm.api.weather.config;


import java.util.List;

public class UpdateCitiesReq {

    private UpdateBean weather;

    public UpdateCitiesReq(List<CityBean> cityList) {
        this.weather = new UpdateBean(cityList.toString());
    }

    public UpdateBean getWeather() {
        return weather;
    }

    public void setWeather(UpdateBean weather) {
        this.weather = weather;
    }

    public static class UpdateBean {
        private String cities;

        public UpdateBean(String cities) {
            this.cities = cities;
        }

        public String getCities() {
            return cities;
        }

        public void setCities(String cities) {
            this.cities = cities;
        }
    }

}