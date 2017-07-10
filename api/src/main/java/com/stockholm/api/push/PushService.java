package com.stockholm.api.push;


import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface PushService {

    @POST("/v1/push")
    Observable<Response<NoBodyResp>> sendPush(@Body CommonPushReq req);

}