package com.stockholm.api.account.customization;


public class UpdateCustomizationReq {
    private CustomizationBean customization;

    public UpdateCustomizationReq(CustomizationBean customization) {
        this.customization = customization;
    }

    public CustomizationBean getCustomization() {
        return customization;
    }

    public void setCustomization(CustomizationBean customization) {
        this.customization = customization;
    }

}
