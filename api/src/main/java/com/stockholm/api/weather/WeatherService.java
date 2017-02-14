package com.stockholm.api.weather;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Single;

public interface WeatherService {

    String KEY = "Ixjs94xmI3LF8UiO24589DhG20Sisx84";
    String TYPE = "search";

    @GET("/Ecalender/openapi/city4weather")
    Single<City> getCityIdByName(@Query("key") String key, @Query("type") String search, @Query("keyword") String name);

    @GET("/Ecalender/openapi/weather")
    Single<Weather> getWeatherByCityId(@Query("key") String key, @Query("citykey") String cityId);
}
