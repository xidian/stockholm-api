package com.stockholm.api.weather.config;


import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import rx.Observable;

public interface WeatherConfigService {

    @GET("/app/weather")
    Observable<Response<WeatherConfig>> queryConfig();

    @PUT("/app/weather")
    Observable<Response<NoBodyResp>> updateConfig(@Body UpdateWeatherConfigReq req);

}