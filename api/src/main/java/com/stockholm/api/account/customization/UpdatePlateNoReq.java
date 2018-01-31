package com.stockholm.api.account.customization;


public class UpdatePlateNoReq {
    private UpdateBean customization;

    public UpdatePlateNoReq(int tailPlateNumber) {
        this.customization = new UpdateBean(tailPlateNumber);
    }

    public UpdateBean getCustomization() {
        return customization;
    }

    public void setCustomization(UpdateBean customization) {
        this.customization = customization;
    }

    public static class UpdateBean {
        private int tailPlateNumber;

        public UpdateBean(int tailPlateNumber) {
            this.tailPlateNumber = tailPlateNumber;
        }

        public int getTailPlateNumber() {
            return tailPlateNumber;
        }

        public void setTailPlateNumber(int tailPlateNumber) {
            this.tailPlateNumber = tailPlateNumber;
        }
    }

}