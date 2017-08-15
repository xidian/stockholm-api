package com.stockholm.api.log;


import com.stockholm.api.base.BaseResponse;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import rx.Observable;

public interface LogService {

    /**
     * 找到日志并上传
     */
    public static final int STATUS_OK = 1;

    /**
     * 没有日志文件
     */
    public static final int STATUS_NO_LOG = 2;

    /**
     * 指定的时间段内没有日志文件
     */
    public static final int STATUS_NO_LOG_DURATION = 3;

    /**
     * @param id order=998的push返回的id
     */
    @GET("/v1/device/logs/{id}")
    Observable<Response<BaseResponse<LogResp>>> getUploadToken(@Path("id") String id);

    @PUT("/v1/device/log")
    Observable<Response<BaseResponse>> updateUploadStatus(int status);
}
