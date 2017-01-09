package com.stockholm.api.login;


import retrofit2.http.POST;
import rx.Observable;

public interface LogoutService {

    @POST("users/logout")
    Observable<LogoutResp> logout();
}
