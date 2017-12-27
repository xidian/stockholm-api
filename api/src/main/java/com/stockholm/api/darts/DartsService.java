package com.stockholm.api.darts;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface DartsService {

    @GET("app/darts")
    Observable<Response<BaseResponse<DartsConfigBean>>> queryConfig();

    @PUT("app/darts")
    Observable<Response<BaseResponse>> updateRecord(@Body UpdateRecordReq req);

    @PUT("app/darts")
    Observable<Response<BaseResponse>> updateScores(@Body UpdateScoresReq req);

}