package com.stockholm.api.weather.config;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface WeatherConfigService {

    @GET("/app/weather")
    Observable<Response<BaseResponse<WeatherConfig>>> queryConfig();

    @PUT("/app/weather")
    Observable<Response<BaseResponse>> updateAlertConfig(@Body UpdateAlertReq req);

    @PUT("/app/weather")
    Observable<Response<BaseResponse>> updateCitiesConfig(@Body UpdateCitiesReq req);

    @PUT("/app/weather")
    Observable<Response<BaseResponse>> updateLocationConfig(@Body UpdateLocationReq req);

}