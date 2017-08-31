package com.stockholm.api.rom;

public class VersionReq {

    private RomBean rom;

    public RomBean getRom() {
        return rom;
    }

    public void setRom(RomBean rom) {
        this.rom = rom;
    }

    public static class RomBean {

        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
