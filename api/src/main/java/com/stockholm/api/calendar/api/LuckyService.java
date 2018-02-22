package com.stockholm.api.calendar.api;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface LuckyService {

    String KEY = "Ixjs94xmI3LF8UiO24589DhG20Sisx84";
    String TIME_TYPE = "day";

    /**
     * Aries(白羊座),Taurus(金牛座),Gemini(双子座),Cancer(巨蟹座),Leo(狮子座),Virgo(处女座),
     * Libra(天秤座),Scorpio(天蝎座),Sagittarius(射手座),Capricorn(摩羯座),Aquarius(水瓶座),
     * Pisces(双鱼座)
     */
    String[] TYPE = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
            "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};

    @GET("/Ecalender/openapi/horoscope")
    Observable<Response<LuckDataResp>> getLuckyData(@Query("key") String key,
                                                    @Query("timeType") String timeType,
                                                    @Query("type") String type);

}