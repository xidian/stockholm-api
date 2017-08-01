package com.stockholm.api.setting.news;


import com.stockholm.api.audio.AudioRecord;
import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface NewsService {

    @GET("/app/news/channels")
    Observable<GetAllChannelsResp> getAllChannels();

    @GET("/app/news/subscriptions")
    Observable<NewsConfigResp> getNewsConfig();

    @POST("/app/news/channels/{categoryId}/subscribe")
    Observable<NewsCommonResp> subscribeChannel(@Path("categoryId") long categoryId);

    @HTTP(method = "DELETE", path = "/app/news/channels/{categoryId}/unsubscribe")
    Observable<NewsCommonResp> unSubscribeChannel(@Path("categoryId") long categoryId);

    @GET("/app/news/contents")
    Observable<DeviceNewsListResp> deviceAllNews();

    @GET("/app/news/channels/{categoryId}/contents")
    Observable<DeviceNewsListResp> getNewsByCategotyId(@Path("categoryId") long categoryId);

    @GET("/app/news/record")
    Observable<Response<BaseResponse<AudioRecord>>> getNewsAudioRecord();

    @PUT("/app/news/record")
    Observable<NewsCommonResp> updateNewsAudioRecord(@Body NewsUpdateRecordReq req);

}