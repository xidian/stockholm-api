package com.stockholm.api.weather;


public class City {

    public String desc;
    public int status;
    public Data[] data;

    public boolean isOk() {
        return desc.equals("OK") && status == 1000;
    }

    public String getCityId() {
        if (data != null && data.length > 0) {
            return data[0].cityid;
        }

        return "";
    }

    public String getCityName() {
        if (data != null && data.length > 0) {
            return data[0].name;
        }

        return "";
    }

    private static class Data {
        public String prov;
        public String name;
        public String country;
        public String cityid;
    }
}
