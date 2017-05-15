package com.stockholm.api.setting.news;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface TingWenService {

    @FormUrlEncoded
    @POST("api/interfaceXykj/touList")
    Observable<ChannelNewsResp> getToulistNews(@Field("limit") int limit,
                                                @Field("page") int page);

    @FormUrlEncoded
    @POST("api/interfaceXykj/postList")
    Observable<ChannelNewsResp> getNews(@Field("term_id") int categoryId,
                                        @Field("limit") int limit,
                                        @Field("page") int page);
}
