package com.stockholm.api.base;


import com.google.gson.Gson;

public class BaseDataBean {

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public static BaseDataBean get(String json) {
        return new Gson().fromJson(json, BaseDataBean.class);
    }

}