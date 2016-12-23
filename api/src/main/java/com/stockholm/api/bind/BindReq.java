package com.stockholm.api.bind;

public class BindReq {

    private ClockBean clock;

    public BindReq(String uuid, String devicePushId, String installedApps) {
        new ClockBean(uuid, devicePushId, installedApps);
    }

    public ClockBean getClock() {
        return clock;
    }

    public void setClock(ClockBean clock) {
        this.clock = clock;
    }

    public static class ClockBean {

        private String uuid;
        private String devicePushId;
        private String installedApps;

        public ClockBean(String uuid, String devicePushId, String installedApps) {
            setUuid(uuid);
            setDevicePushId(devicePushId);
            setInstalledApps(installedApps);
        }

        public String getInstalledApps() {
            return installedApps;
        }

        public void setInstalledApps(String installedApps) {
            this.installedApps = installedApps;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getDevicePushId() {
            return devicePushId;
        }

        public void setDevicePushId(String devicePushId) {
            this.devicePushId = devicePushId;
        }
    }
}
