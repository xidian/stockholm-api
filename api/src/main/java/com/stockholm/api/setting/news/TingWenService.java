package com.stockholm.api.setting.news;


import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface TingWenService {

    @POST("api/interfaceXykj/touList")
    Observable<DeviceChannelResp> getHeadLineNews();

    @POST("api/interfaceXykj/postList")
    Observable<DeviceChannelResp> getChannelNews(@Body ChannelNewsReq channelNewsReq);
}
