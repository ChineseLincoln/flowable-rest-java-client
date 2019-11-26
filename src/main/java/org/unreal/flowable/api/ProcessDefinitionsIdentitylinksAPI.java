package org.unreal.flowable.api;

import org.flowable.bpmn.model.BpmnModel;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.deployment.DeploymentResource;
import org.unreal.flowable.model.process.definitions.ChangeState;
import org.unreal.flowable.model.process.definitions.ProcessDefinitions;
import org.unreal.flowable.model.process.definitions.ProcessDefinitionsLinks;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface ProcessDefinitionsIdentitylinksAPI {


    @GET("repository/process-definitions/{processDefinitionId}/identitylinks")
    List<ProcessDefinitionsLinks> getProcessDefinitionsLinks(@Path("processDefinitionId") String processDefinitionId);

    @POST("repository/process-definitions/{processDefinitionId}/identitylinks")
    ProcessDefinitionsLinks createProcessDefinitionsLinks(@Path("processDefinitionId") String processDefinitionId, @Body Map<String, String> data);

    @DELETE("repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}")
    ProcessDefinitionsLinks deleteProcessDefinitionsLinks(@Path("processDefinitionId") String processDefinitionId,
                                                          @Path("family") String family,
                                                          @Path("identityId") String identityId);

    @GET("repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}")
    ProcessDefinitionsLinks getProcessDefinitionsLinks(@Path("processDefinitionId") String processDefinitionId,
                                                       @Path("family") String family,
                                                       @Path("identityId") String identityId);
}
