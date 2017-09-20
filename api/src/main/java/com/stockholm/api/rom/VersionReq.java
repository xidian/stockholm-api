package com.stockholm.api.rom;

public class VersionReq {

    private String romInfo;

    public String getRomInfo() {
        return romInfo;
    }

    public void setRomInfo(String romInfo) {
        this.romInfo = romInfo;
    }

    public VersionReq(String romInfo) {
        this.romInfo = romInfo;
    }
}

