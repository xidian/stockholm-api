package com.stockholm.api.setting.music;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import rx.Observable;

public interface MusicService {

    @POST("/mobile/clock/app/check_subscription")
    Observable<SubscribeResp> checkSubscribe(@HeaderMap Map<String, String> headerMap,
                                             @Body SubscribeReq subscribeReq);
}
