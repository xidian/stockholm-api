package com.stockholm.api.setting;

import java.util.List;

/**
 * Created by taopu on 2016/12/29.
 */

public class GetClockAppsResp {

    private boolean success;
    private String msg;
    private ClockBean clock;

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

    public ClockBean getClock() {
        return clock;
    }

    public void setClock(ClockBean clock) {
        this.clock = clock;
    }

    public static class ClockBean {

        private int id;
        private String uuid;
        private List<AppsBean> apps;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public List<AppsBean> getApps() {
            return apps;
        }

        public void setApps(List<AppsBean> apps) {
            this.apps = apps;
        }

        public static class AppsBean {

            private int id;
            private String name;
            private String icon;
            private Object type;
            private String packageName;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getType() {
                return type;
            }

            public void setType(Object type) {
                this.type = type;
            }

            public String getPackageName() {
                return packageName;
            }

            public void setPackageName(String packageName) {
                this.packageName = packageName;
            }
        }
    }
}
