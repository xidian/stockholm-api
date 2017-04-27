package com.stockholm.api.setting.system;


import java.util.List;

public class GetBindClocksResp {
    private boolean success;
    private String msg;
    private DataBean data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<DeviceBean> list;
        private DeviceBean active;

        public List<DeviceBean> getList() {
            return list;
        }

        public void setList(List<DeviceBean> list) {
            this.list = list;
        }

        public DeviceBean getActive() {
            return active;
        }

        public void setActive(DeviceBean active) {
            this.active = active;
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

}