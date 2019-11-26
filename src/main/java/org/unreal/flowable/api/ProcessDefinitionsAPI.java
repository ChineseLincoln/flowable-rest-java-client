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
public interface ProcessDefinitionsAPI {

    @GET("repository/process-definitions")
    Paging<ProcessDefinitions> getProcessDefinitions();

    @GET("repository/process-definitions/{processDefinitionId}")
    Paging<ProcessDefinitions> getProcessDefinitions(@Path("processDefinitionId") String processDefinitionId);

    @PUT("repository/process-definitions/{processDefinitionId}")
    Void updateProcessDefinitions(@Body Map<String,String> data);

    @GET("repository/process-definitions/{processDefinitionId}/resourcedata")
    Paging<DeploymentResource> getResourcesData(@Path("processDefinitionId") String processDefinitionId);

    @GET("repository/process-definitions/{processDefinitionId}/resourcedata")
    BpmnModel getModel(@Path("processDefinitionId") String processDefinitionId);

    @PUT("repository/process-definitions/{processDefinitionId}")
    ProcessDefinitions changeState(@Path("processDefinitionId") String processDefinitionId , @Body ChangeState changeState);

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
