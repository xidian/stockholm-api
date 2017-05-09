package com.stockholm.api.push;


import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface PushService {

    @POST("/mobile/push")
    Observable<CommonPushResp> pushToDevice(@Body CommonPushReq req);

    @POST("/mobile/push")
    Observable<CommonPushResp> pushToDevice(@HeaderMap Map<String, String> headerMap, @Body CommonPushReq req);

    @POST("/device/push")
    Observable<CommonPushResp> pushToMobile(@Body CommonPushReq req);

}