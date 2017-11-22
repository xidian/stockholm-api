package com.stockholm.api.mozik.config;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface MozikConfigService {

    @GET("/app/mozik")
    Observable<Response<BaseResponse<ConfigBean>>> queryConfig();

    @PUT("/app/mozik")
    Observable<Response<BaseResponse>> updateToken(@Body UpdateTokenReq req);

    @PUT("/app/mozik")
    Observable<Response<BaseResponse>> updateWallpaper(@Body UpdateWallpaperReq req);

}