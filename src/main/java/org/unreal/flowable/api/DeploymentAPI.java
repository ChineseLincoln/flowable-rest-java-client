package org.unreal.flowable.api;

import okhttp3.MultipartBody;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.deployment.Deployment;
import org.unreal.flowable.model.deployment.DeploymentResource;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface DeploymentAPI {

    @GET("repository/deployments")
    Paging<Deployment> getDeployments(@QueryMap Map<String, Object> params);

    @GET("repository/deployments")
    Paging<Deployment> getDeployments();

    @POST("repository/deployments")
    @Multipart
    Deployment createDeployments(@Part MultipartBody.Part file);

    @DELETE("repository/deployments/{id}")
    String deleteDeployment(@Path("id") String id);

    @GET("repository/deployments/{id}")
    Deployment getDeployment(@Path("id") String id);

    @GET("repository/deployments/{deploymentId}/resources")
    List<DeploymentResource> getResourcesById(@Path("deploymentId") String deploymentId);

    @GET("repository/deployments/{deploymentId}/resourcedata/{resourceId}")
    String getResourceContentById(@Path("deploymentId") String deploymentID, @Path("resourceId") String resourceId);

    @GET("repository/deployments/{deploymentId}/resources/{resourceId}")
    DeploymentResource getResourceWildcard(@Path("deploymentId") String deploymentId, @Path("resourceId") String resourceId);
}
