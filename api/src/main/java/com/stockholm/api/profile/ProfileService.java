package com.stockholm.api.profile;


import com.stockholm.api.account.CheckVerifiCodeReq;
import com.stockholm.api.account.CheckVerifiCodeResp;
import com.stockholm.api.account.SendVerifyCodeReq;
import com.stockholm.api.account.SendVerifiCodeResp;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface ProfileService {

    @PUT("/user/username")
    Observable<UpdateProfileResp> updateUserName(@Body UpdateUserNameReq req);

    @PUT("/user/phone_number")
    Observable<UpdateProfileResp> updatePhoneNumber(@Body UpdatePhoneReq req);

    @PUT("/user/password")
    Observable<UpdateProfileResp> updatePwd(@Body UpdatePwdReq req);

    @POST("/user/avatar")
    Observable<AvatarTokenResp> getAvatarToken();

    @GET("/user/avatar")
    Observable<GetAvatarResp> getAvatar();

    @POST("verification_codes")
    Observable<SendVerifiCodeResp> sendVerifiCode(@Body SendVerifyCodeReq verifiCodeReq);

    @POST("verification_codes/verify")
    Observable<CheckVerifiCodeResp> checkVerifiCode(@Body CheckVerifiCodeReq checkVerifiCodeReq);

}