package com.stockholm.api.heartbeat;


import retrofit2.http.POST;
import rx.Observable;

public interface HeartbeatService {

    @POST("/mobile/clock/check_device_alive")
    Observable<HeartbeatResponse> checkDeviceAlive();

    @POST("/mobile/clock/end_device_connection")
    Observable<HeartbeatResponse> closeDeviceConnection();

}
