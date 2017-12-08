package com.stockholm.api.weather.config;


public class UpdateLocationReq {

    private UpdateBean weather;

    public UpdateLocationReq(CityBean locationCity) {
        this.weather = new UpdateBean(locationCity.toString());
    }

    public UpdateBean getWeather() {
        return weather;
    }

    public void setWeather(UpdateBean weather) {
        this.weather = weather;
    }

    public static class UpdateBean {
        private String location;

        public UpdateBean(String location) {
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }

}