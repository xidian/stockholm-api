package com.stockholm.api.account;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface AccountService {

    @POST("/v1/account/session")
    Observable<Response<BaseResponse<LoginDataBean>>> login(@Body LoginReq req);

    @DELETE("/v1/account/session")
    Observable<Response<BaseResponse>> logout();

    @POST("/v1/account/user")
    Observable<Response<BaseResponse<RegisterDataBean>>> register(@Body RegisterReq req);

    @PUT("/v1/account/user")
    Observable<Response<BaseResponse>> updateUser(@Body UpdateUserReq updateUserReq);

    @POST("/v1/verification-code")
    Observable<Response<BaseResponse>> sendVerifyCode(@Body SendVerifyCodeReq verifyCodeReq);

    @POST("/v1/account/avatar")
    Observable<Response<BaseResponse<AvatarTokenData>>> getAvatarToken();

    @POST("/v1/verification-code/verify")
    Observable<Response<BaseResponse>> checkVerifyCode(@Body CheckVerifyCodeReq checkVerifyCodeReq);

    @PUT("/v1/account/password")
    Observable<Response<BaseResponse>> updatePassword(@Body UpdatePasswordReq updatePasswordReq);

    @PUT("/v1/account/password/reset")
    Observable<Response<BaseResponse>> resetPassword(@Body ResetPasswordReq resetPasswordReq);

    @POST("/v1/account/wechat")
    Observable<Response<BaseResponse<BindWeChatDataBean>>> bindWechat(@Body BindWechatReq bindWechatReq);

    @DELETE("/v1/account/wechat")
    Observable<Response<BaseResponse>> unbindWechat();

    @POST("/v1/account/session/wechat")
    Observable<Response<BaseResponse<WeChatLoginData>>> loginWithinWechat(@Body WechatLoginReq wechatLoginReq);

    @POST("/v1/account/password/check")
    Observable<Response<BaseResponse<VerifyPasswordData>>> verifyPassword(@Body VerifyPasswordReq verifyPasswordReq);

    @GET("/v1/account/session")
    Observable<Response<BaseResponse<VerifySessionData>>> verifySession();

    @PUT("/v1/account/phone-number")
    Observable<Response<BaseResponse>> updatePhone(@Body UpdatePhoneReq updatePhoneReq);

}