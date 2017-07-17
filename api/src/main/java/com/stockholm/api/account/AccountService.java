package com.stockholm.api.account;


import com.stockholm.api.NoBodyResp;
import com.stockholm.api.account.wx.BindWeChatResp;
import com.stockholm.api.account.wx.CommonWeChatReq;
import com.stockholm.api.account.wx.UnbindWeChatResp;
import com.stockholm.api.account.wx.WeChatLoginResp;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface AccountService {

    @POST("users/login")
    Observable<LoginResp> login(@Header("SerialNumber") String SerialNumber, @Body LoginReq login);

    @POST("users/register")
    Observable<SignResp> sign(@Body SignReq sign);

    @PUT("users/update-password")
    Observable<ResetPwdResp> resetPwd(@Body ResetPwdReq resetPwdReq);

    @POST("/users/check_serial_number")
    Observable<CheckSerialNumberResp> checkSerialNumber(@Body CheckSerialNumberReq req);

    @POST("/user/wechat")
    Observable<BindWeChatResp> bindWeChat(@Body CommonWeChatReq req);

    @POST("/user/wechat/unbind")
    Observable<UnbindWeChatResp> unbindWeChat();

    @POST("/user/wechat/login")
    Observable<WeChatLoginResp> weChatLogin(@Body CommonWeChatReq req);


    @POST("/v1/account/session")
    Observable<Response<LoginResp>> login(@Body LoginReq req);

    @DELETE("/v1/account/session")
    Observable<Response<NoBodyResp>> logout();

    @POST("/v1/account/user")
    Observable<Response<RegisterResp>> register(@Body RegisterReq req);

    @PUT("/v1/account/user")
    Observable<Response<NoBodyResp>> updateUser(@Body UpdateUserReq updateUserReq);

    @POST("/v1/verification-code")
    Observable<Response<NoBodyResp>> sendVerifyCode(@Body SendVerifyCodeReq verifyCodeReq);

    @POST("/v1/account/avatar")
    Observable<Response<AvatarTokenResp>> getAvatarToken();

    @POST("/v1/verification-code/verify")
    Observable<Response<NoBodyResp>> checkVerifiCode(@Body CheckVerifiCodeReq checkVerifiCodeReq);

    @POST("/v1/account/password")
    Observable<Response<UpdatePasswordResp>> updatePassword(@Body UpdatePasswordReq updatePasswordReq);

    @POST("/v1/account/password/reset")
    Observable<Response<ResetPasswordResp>> resetPassword(@Body ResetPasswordReq resetPasswordReq);

}