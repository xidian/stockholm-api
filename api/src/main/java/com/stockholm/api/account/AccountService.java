package com.stockholm.api.account;


import com.stockholm.api.NoBodyResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface AccountService {

    @POST("/v1/account/session")
    Observable<Response<LoginResp>> login(@Body LoginReq req);

    @DELETE("/v1/account/session")
    Observable<Response<LogoutResp>> logout();

    @POST("/v1/account/user")
    Observable<Response<RegisterResp>> register(@Body RegisterReq req);

    @PUT("/v1/account/user")
    Observable<Response<NoBodyResp>> updateUser(@Body UpdateUserReq updateUserReq);

    @POST("/v1/verification-code")
    Observable<Response<SendVerifyCodeResp>> sendVerifyCode(@Body SendVerifyCodeReq verifyCodeReq);

    @POST("/v1/account/avatar")
    Observable<Response<AvatarTokenResp>> getAvatarToken();

    @POST("/v1/verification-code/verify")
    Observable<Response<CheckVerifyCodeResp>> checkVerifyCode(@Body CheckVerifyCodeReq checkVerifyCodeReq);

    @PUT("/v1/account/password")
    Observable<Response<UpdatePasswordResp>> updatePassword(@Body UpdatePasswordReq updatePasswordReq);

    @PUT("/v1/account/password/reset")
    Observable<Response<ResetPasswordResp>> resetPassword(@Body ResetPasswordReq resetPasswordReq);

    @POST("/v1/account/wechat")
    Observable<Response<BindWechatResp>> bindWechat(@Body BindWechatReq bindWechatReq);

    @DELETE("/v1/account/wechat")
    Observable<Response<UnbindWechatResp>> unbindWechat();

    @POST("/v1/account/session/wechat")
    Observable<Response<WechatLoginResp>> loginWithinWechat(@Body WechatLoginReq wechatLoginReq);

    @POST("/v1/account/password/check")
    Observable<Response<VerifyPasswordResp>> verifyPassword(@Body VerifyPasswordReq verifyPasswordReq);

    @GET("/v1/account/session")
    Observable<Response<VerifySessionResp>> verifySession();

    @PUT("/v1/account/phone-number")
    Observable<Response<UpdatePhoneResp>> updatePhone(@Body UpdatePhoneReq updatePhoneReq);
}