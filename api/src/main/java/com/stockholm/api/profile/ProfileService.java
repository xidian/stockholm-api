package com.stockholm.api.profile;


import com.stockholm.api.login.CheckVerifiCodeReq;
import com.stockholm.api.login.CheckVerifiCodeResp;
import com.stockholm.api.login.SendVerifiCodeReq;
import com.stockholm.api.login.SendVerifiCodeResp;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface ProfileService {

    @PUT("/user/username")
    Observable<UpdateProfileResp> updateUserName(@HeaderMap Map<String, String> headerMap, @Body UpdateUserNameReq req);

    @PUT("/user/phone_number")
    Observable<UpdateProfileResp> updatePhoneNumber(@HeaderMap Map<String, String> headerMap, @Body UpdatePhoneReq req);

    @PUT("/user/password")
    Observable<UpdateProfileResp> updatePwd(@HeaderMap Map<String, String> headerMap, @Body UpdatePwdReq req);

    @POST("/user/avatar")
    Observable<AvatarTokenResp> getAvatarToken(@HeaderMap Map<String, String> headerMap);

    @GET("/user/avatar")
    Observable<GetAvatarResp> getAvatar(@HeaderMap Map<String, String> headerMap);

    @POST("verification_codes")
    Observable<SendVerifiCodeResp> sendVerifiCode(@Body SendVerifiCodeReq verifiCodeReq);

    @POST("verification_codes/verify")
    Observable<CheckVerifiCodeResp> checkVerifiCode(@Body CheckVerifiCodeReq checkVerifiCodeReq);

}