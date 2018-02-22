package com.stockholm.api.timer;

import com.stockholm.api.NoBodyResp;
import com.stockholm.api.base.BaseResponse;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface TimerService {

    @GET("/app/timer/events")
    Observable<Response<BaseResponse<List<TimerBean>>>> listMineTimer();

    @POST("/app/timer/events")
    Observable<Response<BaseResponse<NoBodyResp>>> createTimer(@Body CreateUpdateReq createUpdateReq);

    @PUT("/app/timer/events/{timerId}")
    Observable<Response<BaseResponse<NoBodyResp>>> updateTimer(@Path("timerId") String timerId, @Body CreateUpdateReq createUpdateReq);

    @DELETE("/app/timer/events/{timerId}")
    Observable<Response<BaseResponse<NoBodyResp>>> deleteTimer(@Path("timerId") String timerId);
}
