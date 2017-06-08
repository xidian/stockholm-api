package com.stockholm.api.weather.config;


public class CityBean {

    private String name;
    private String province;
    private String cityId;
    private boolean select;
    private boolean location;
    private boolean visible;

    public CityBean(String name, String province, String cityId, boolean select, boolean location) {
        this.name = name;
        this.province = province;
        this.cityId = cityId;
        this.select = select;
        this.location = location;
        this.visible = true;
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CityBean)) return false;
        CityBean bean = (CityBean) obj;
        return bean.cityId.equals(cityId);
    }

}