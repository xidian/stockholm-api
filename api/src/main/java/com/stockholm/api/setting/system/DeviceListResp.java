package com.stockholm.api.setting.system;


import java.util.List;

public class DeviceListResp {

    private List<DeviceBean> list;
    private ActiveBean active;

    public List<DeviceBean> getList() {
        return list;
    }

    public void setList(List<DeviceBean> list) {
        this.list = list;
    }

    public ActiveBean getActive() {
        return active;
    }

    public void setActive(ActiveBean active) {
        this.active = active;
    }

    public static class ActiveBean {
        private String uuid;
        private String name;
        private boolean guide;

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isGuide() {
            return guide;
        }

        public void setGuide(boolean guide) {
            this.guide = guide;
        }
    }

    public static class DeviceBean {
        private String uuid;
        private String name;

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}