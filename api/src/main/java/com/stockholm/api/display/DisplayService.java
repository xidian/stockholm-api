package com.stockholm.api.display;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface DisplayService {

    @GET("/v1/device/display")
    Observable<Response<BaseResponse<DisplayConfigBean>>> getDisplayConfig();

    @PUT("/v1/device/config")
    Observable<Response<BaseResponse>> updateDisplayConfig(@Body UpdateConfigReq req);

}
