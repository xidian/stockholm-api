package com.stockholm.api.login;


import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface LoginService {

    @POST("users/login")
    Observable<LoginResp> login(@Body LoginReq login);

    @POST("users/register")
    Observable<SignResp> sign(@Body SignReq sign);

    @POST("verification_codes")
    Observable<SendVerifiCodeResp> sendVerifiCode(@Body SendVerifiCodeReq verifiCodeReq);

    @POST("/verification_codes/verify")
    Observable<CheckVerifiCodeResp> checkVerifiCode(@Body CheckVerifiCodeReq checkVerifiCodeReq);

    @PUT("/users/update-password")
    Observable<ResetPwdResp> resetPwd(@Body ResetPwdReq resetPwdReq);
}
