package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.jobs.Jobs;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface JobsAPI {

    @GET("management/jobs/{jobId}")
    Jobs getJobsByJobId(@Path("jobId") String jobId);

    @DELETE("management/jobs/{jobId}")
    Void deleteJobsByJobId(@Path("jobId") String jobId);

    @POST("management/jobs/{jobId}")
    Void deleteJobsByJobId(@Path("jobId") String jobId,
                           @Body Map<String,String> action);

    @GET("management/jobs/{jobId}/exception-stacktrace")
    String getJobsExceptionByJobId(@Path("jobId") String jobId);

    @GET("management/jobs")
    Paging<Jobs> getJobsByJobId(@QueryMap Map<String,String> query);

}
