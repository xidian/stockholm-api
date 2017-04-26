package com.stockholm.api.login;


import com.stockholm.api.login.wx.BindWeChatResp;
import com.stockholm.api.login.wx.CommonWeChatReq;
import com.stockholm.api.login.wx.UnbindWeChatResp;
import com.stockholm.api.login.wx.WeChatLoginResp;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;

public interface LoginService {

    @POST("users/login")
    Observable<LoginResp> login(@Header("SerialNumber") String SerialNumber, @Body LoginReq login);

    @POST("users/register")
    Observable<SignResp> sign(@Body SignReq sign);

    @POST("verification_codes")
    Observable<SendVerifiCodeResp> sendVerifiCode(@Body SendVerifiCodeReq verifiCodeReq);

    @POST("verification_codes/verify")
    Observable<CheckVerifiCodeResp> checkVerifiCode(@Body CheckVerifiCodeReq checkVerifiCodeReq);

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

}