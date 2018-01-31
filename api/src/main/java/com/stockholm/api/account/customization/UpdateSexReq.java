package com.stockholm.api.account.customization;


public class UpdateSexReq {
    private UpdateBean customization;

    public UpdateSexReq(int sex) {
        this.customization = new UpdateBean(sex);
    }

    public UpdateBean getCustomization() {
        return customization;
    }

    public void setCustomization(UpdateBean customization) {
        this.customization = customization;
    }

    public static class UpdateBean {
        private int sex;

        public UpdateBean(int sex) {
            this.sex = sex;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }
}
