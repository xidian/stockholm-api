package com.stockholm.api.setting;


import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import rx.Observable;

public interface SettingService {

    @GET("/mobile/clocks/{clock_id}/apps")
    Observable<GetClockAppsResp> getClockApps(@Header("Access-Token") String Access_Token, @Path("clock_id") String clockId);
}
