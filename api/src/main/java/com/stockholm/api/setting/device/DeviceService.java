package com.stockholm.api.setting.device;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import rx.Observable;

public interface DeviceService {

    @GET("/clocks")
    Observable<DeviceListResp> getUserDeviceList(@HeaderMap Map<String, String> headerMap);
}
