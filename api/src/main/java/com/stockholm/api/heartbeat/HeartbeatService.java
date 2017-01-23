package com.stockholm.api.heartbeat;


import java.util.Map;

import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface HeartbeatService {

    @POST("/mobile/clock/check_device_alive")
    Observable<HeartbeatResponse> checkDeviceAlive(@HeaderMap Map<String, String> map);

    @POST("/mobile/clock/end_device_connection")
    Observable<HeartbeatResponse> closeDeviceConnection(@HeaderMap  Map<String, String> map);

}
