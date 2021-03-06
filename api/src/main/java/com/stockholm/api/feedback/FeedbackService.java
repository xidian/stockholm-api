package com.stockholm.api.feedback;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface FeedbackService {

    @POST("/v1/feedbacks")
    Observable<Response<BaseResponse>> feedback(@Body FeedbackReq req);

}
