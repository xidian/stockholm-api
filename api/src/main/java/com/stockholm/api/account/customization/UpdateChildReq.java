package com.stockholm.api.account.customization;


public class UpdateChildReq {
    private UpdateBean customization;

    public UpdateChildReq(int haveChildren) {
        this.customization = new UpdateBean(haveChildren);
    }

    public UpdateBean getCustomization() {
        return customization;
    }

    public void setCustomization(UpdateBean customization) {
        this.customization = customization;
    }

    public static class UpdateBean {
        private int haveChildren;

        public UpdateBean(int haveChildren) {
            this.haveChildren = haveChildren;
        }

        public int getHaveChildren() {
            return haveChildren;
        }

        public void setHaveChildren(int haveChildren) {
            this.haveChildren = haveChildren;
        }
    }

}