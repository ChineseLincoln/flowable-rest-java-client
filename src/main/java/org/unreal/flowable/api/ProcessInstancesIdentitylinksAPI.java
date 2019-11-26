package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.identitylinks.Identitylinks;
import org.unreal.flowable.model.identitylinks.UserIdentitylinks;
import org.unreal.flowable.model.process.instances.ProcessInstances;
import org.unreal.flowable.model.variables.Variables;
import org.unreal.flowable.request.ProcessInstanceStartByDefinitionIdQuery;
import org.unreal.flowable.request.ProcessInstanceStartByDefinitionKeyQuery;
import org.unreal.flowable.request.ProcessInstanceStartByMessageQuery;
import org.unreal.flowable.request.ProcessInstancesQuery;
import retrofit2.http.*;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ProcessInstancesIdentitylinksAPI {


    @GET("runtime/process-instances/{processInstanceId}/identitylinks")
    List<Identitylinks> getProcessInstanceIdentitylinks(@Path("processInstanceId") String processInstanceId);

    @POST("runtime/process-instances/{processInstanceId}/identitylinks")
    Identitylinks createProcessInstanceUserIdentitylinks(@Path("processInstanceId") String processInstanceId,
                                                         @Body UserIdentitylinks userIdentitylinks);

    @DELETE("runtime/process-instances/{processInstanceId}/identitylinks/users/{user}/{type}")
    Void deleteProcessInstanceUserIdentitylinks(@Path("processInstanceId") String processInstanceId,
                                                @Path("user") String user,
                                                @Path("type") String type);

}
