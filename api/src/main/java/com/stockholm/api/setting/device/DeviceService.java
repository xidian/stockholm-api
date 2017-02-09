package com.stockholm.api.setting.device;

import retrofit2.http.GET;
import rx.Observable;

public interface DeviceService {

    @GET("/clocks")
    Observable<DeviceListResp> getUserDeviceList();
}
