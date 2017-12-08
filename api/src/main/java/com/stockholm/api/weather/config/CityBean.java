package com.stockholm.api.weather.config;


import com.google.gson.Gson;

public class CityBean {

    private String name;
    private String province;
    private String cityId;
    private boolean select;
    private boolean location;

    public CityBean(String name, String province, String cityId, boolean select, boolean location) {
        this.name = name;
        this.province = province;
        this.cityId = cityId;
        this.select = select;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public boolean isLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CityBean)) return false;
        CityBean bean = (CityBean) obj;
        return bean.cityId.equals(cityId);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static CityBean get(String json) {
        return new Gson().fromJson(json, CityBean.class);
    }

}