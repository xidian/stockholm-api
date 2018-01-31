package com.stockholm.api.account.customization;


public class UpdateLocationReq {
    private UpdateBean customization;

    public UpdateLocationReq(int location) {
        this.customization = new UpdateBean(location);
    }

    public UpdateBean getCustomization() {
        return customization;
    }

    public void setCustomization(UpdateBean customization) {
        this.customization = customization;
    }

    public static class UpdateBean {
        private int location;

        public UpdateBean(int location) {
            this.location = location;
        }

        public int getLocation() {
            return location;
        }

        public void setLocation(int location) {
            this.location = location;
        }
    }

}