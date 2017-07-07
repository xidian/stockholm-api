package com.stockholm.api.weather.config;


public class UpdateWeatherConfigReq {

    private WeatherConfig weather;

    public UpdateWeatherConfigReq(WeatherConfig weather) {
        this.weather = weather;
    }

    public WeatherConfig getWeather() {
        return weather;
    }

    public void setWeather(WeatherConfig weather) {
        this.weather = weather;
    }

}