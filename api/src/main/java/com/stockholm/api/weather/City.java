package com.stockholm.api.weather;


import java.util.List;

public class City {

    public String desc;
    public int status;
    public List<Data> data;

    public boolean isOk() {
        return desc.equals("OK") && status == 1000;
    }


    public List<Data> getData() {
        return data;
    }

    private static class Data {
        public String prov;
        public String name;
        public String country;
        public String cityid;
    }
}
