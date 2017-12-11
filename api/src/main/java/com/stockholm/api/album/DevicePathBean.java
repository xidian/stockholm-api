package com.stockholm.api.album;


import java.util.List;

public class DevicePathBean {

    private String domain;
    private List<String> paths;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

}