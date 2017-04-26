package com.stockholm.api.feedback;


import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface FeedbackService {

    @POST("/feedbacks")
    Observable<FeedbackResp> feedback(@Body FeedbackReq req);

}
