package com.stockholm.api.account.customization;


public class UpdateAgeReq {
    private UpdateBean customization;

    public UpdateAgeReq(int age) {
        this.customization = new UpdateBean(age);
    }

    public UpdateBean getCustomization() {
        return customization;
    }

    public void setCustomization(UpdateBean customization) {
        this.customization = customization;
    }

    public static class UpdateBean {
        private int age;

        public UpdateBean(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}