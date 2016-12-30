package com.stockholm.api.setting.clock;


import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface ClockConfigService {
    @POST("mobile/device-configs/clocks")
    Observable configClcok(@Body ClockConfigReq body);

}
