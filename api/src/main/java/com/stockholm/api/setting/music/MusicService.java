package com.stockholm.api.setting.music;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface MusicService {

    @POST("/mobile/clock/app/check_subscription")
    Observable<SubscribeResp> checkSubscribe(@Body SubscribeReq subscribeReq);

    @GET("/mobile/clock/app/check_subscription")
    Observable<Response<RecordResp>> queryRecords();

    @GET("/app/music/charts")
    Observable<Response<List<ChartBean>>> queryCharts();

    @GET("/app/music/charts/{chartId}/items")
    Observable<Response<ChartItemResp>> queryChartItems(@Path("chartId") String chartId, @Query("page") String page, @Query("limit") String limit);
}
