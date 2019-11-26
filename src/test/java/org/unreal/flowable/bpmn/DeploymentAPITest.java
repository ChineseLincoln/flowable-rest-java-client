package org.unreal.flowable.bpmn;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.unreal.flowable.FlowableClient;
import org.unreal.flowable.api.DeploymentAPI;
import org.unreal.flowable.request.DeploymentFilter;
import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.deployment.Deployment;
import org.unreal.flowable.model.deployment.DeploymentResource;
import retrofit2.HttpException;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2018/3/21.
 */
public class DeploymentAPITest {

    private static final String Persist_Deployment_Id = "7";
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDeploymentAPI() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        assertNotNull(deploymentAPI);
        Paging<Deployment> deploymentsRes = deploymentAPI.getDeployments();
        assertNotNull(deploymentsRes);

        DeploymentFilter filter = new DeploymentFilter();
        filter.setName("Debug");
        Paging<Deployment> deploymentsFilterRes = deploymentAPI.getDeployments(filter.toMap());
        assertNotNull(deploymentsFilterRes);
        assertEquals(0, deploymentsFilterRes.getSize());
    }

    @Test
    public void testDelete() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        thrown.expect(HttpException.class);
        thrown.expectMessage(containsString("404"));
        deploymentAPI.deleteDeployment("test");
    }

    @Test
    public void getDeployment() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        Deployment deployment = deploymentAPI.getDeployment(Persist_Deployment_Id);
        assertNotNull(deployment);
        assertEquals(Persist_Deployment_Id, deployment.getId());
    }

    @Test
    public void getResourceById() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        List<DeploymentResource> resourceList = deploymentAPI.getResourcesById(Persist_Deployment_Id);
        assertNotNull(resourceList);
    }

    @Test
    public void getResourceContentById() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        String content = deploymentAPI.getResourceContentById(Persist_Deployment_Id, "createTimersProcess.bpmn20.xml");
        assertNotNull(content);
    }

    @Test
    public void getResourceWildcard() {
        DeploymentAPI deploymentAPI = this.getDeploymentAPI();
        DeploymentResource deploymentResource = deploymentAPI.getResourceWildcard(Persist_Deployment_Id, "createTimersProcess.bpmn20.xml");
        assertNotNull(deploymentResource);
    }


    DeploymentAPI getDeploymentAPI() {
        return FlowableClient.getInstance().connect(Constants.EndPoint, Constants.USERNAME, Constants.PASSWORD).getDeploymentAPI();
    }
}
