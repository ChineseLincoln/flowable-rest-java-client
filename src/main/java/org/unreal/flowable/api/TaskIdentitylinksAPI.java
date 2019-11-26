package org.unreal.flowable.api;

import org.unreal.flowable.model.identitylinks.GroupIdentitylinks;
import org.unreal.flowable.model.identitylinks.Identitylinks;
import org.unreal.flowable.model.identitylinks.UserIdentitylinks;
import retrofit2.http.*;

import java.util.List;

public interface TaskIdentitylinksAPI {

    @GET("runtime/tasks/{taskId}/identitylinks")
    List<Identitylinks> getIdentitylinksByTaskId(@Path("taskId") String taskId);

    @GET("runtime/tasks/{taskId}/identitylinks/{family}")
    List<Identitylinks> getIdentitylinksByTaskIdFamily(@Path("taskId") String taskId,
                                                       @Path("family") String family);

    @GET("runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}")
    List<Identitylinks> getIdentitylinksByIdentityId(@Path("taskId") String taskId,
                                                     @Path("family") String family,
                                                     @Path("identityId") String identityId,
                                                     @Path("type") String type);

    @POST("runtime/tasks/{taskId}/identitylinks")
    Identitylinks createIdentitylinksByTaskId(@Body UserIdentitylinks userIdentitylinks);

    @POST("runtime/tasks/{taskId}/identitylinks")
    Identitylinks createIdentitylinksByTaskId(@Body GroupIdentitylinks groupIdentitylinks);

    @DELETE("runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}")
    Void deleteIdentitylinksByTaskId(@Path("taskId") String taskId,
                                     @Path("family") String family,
                                     @Path("identityId") String identityId,
                                     @Path("type") String type);
}
