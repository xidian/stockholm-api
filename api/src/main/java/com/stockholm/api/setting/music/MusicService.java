package com.stockholm.api.setting.music;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface MusicService {

    @POST("/mobile/clock/app/check_subscription")
    Observable<SubscribeResp> checkSubscribe(@Body SubscribeReq subscribeReq);
}
