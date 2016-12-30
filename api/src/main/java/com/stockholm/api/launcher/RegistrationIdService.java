package com.stockholm.api.launcher;


import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface RegistrationIdService {

    @POST("/clocks/register-push-token")
    Observable<RegistrationIdResp> setRegistrationid(@Body RegistrationIdReq registrationIdReq);

}
