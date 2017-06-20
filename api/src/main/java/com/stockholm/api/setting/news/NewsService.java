package com.stockholm.api.setting.news;


import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface NewsService {

    @GET("app/news/channels")
    Observable<GetAllChannelsResp> getAllChannels();

    @GET("app/news/subscriptions")
    Observable<NewsConfigResp> getNewsConfig();

    @HTTP(method = "DELETE" , path = "/app/news/channels/{categoryId}/unsubscribe")
    Observable<NewsCommonResp> subscribeChannel(@Path("categoryId") long categoryId);

    @POST("/app/news/channels/{categoryId}/subscribe")
    Observable<NewsCommonResp> unSubscribeChannel(@Path("categoryId") long categoryId);

    @GET("")
    Observable<DeviceNewsListResp> deviceAllNews();

    @GET("")
    Observable<DeviceNewsListResp> getNewsByCategotyId(@Query("categoryId") long categoryId);

}