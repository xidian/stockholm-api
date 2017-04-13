package com.stockholm.api.setting.news;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface TingWenService {

    @POST("api/interfaceXykj/touList")
    Observable<ChannelNewsResp> getHeadLineNews(@Field("limit") String limit,
                                                @Field("page") String pager);

    @FormUrlEncoded
    @POST("api/interfaceXykj/postList")
    Observable<ChannelNewsResp> getChannelNews(@Field("term_id") String channelId,
                                               @Field("limit") String limit,
                                               @Field("page") String pager);
}
