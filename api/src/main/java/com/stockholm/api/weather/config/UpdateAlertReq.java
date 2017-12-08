package com.stockholm.api.weather.config;


public class UpdateAlertReq {

    private UpdateBean weather;

    public UpdateAlertReq(AlertBean alertBean) {
        this.weather = new UpdateBean(alertBean.toString());
    }

    public UpdateBean getWeather() {
        return weather;
    }

    public void setWeather(UpdateBean weather) {
        this.weather = weather;
    }

    public static class UpdateBean {
        private String alert;

        public UpdateBean(String alert) {
            this.alert = alert;
        }

        public String getAlert() {
            return alert;
        }

        public void setAlert(String alert) {
            this.alert = alert;
        }
    }

}