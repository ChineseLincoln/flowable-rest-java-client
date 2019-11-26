package org.unreal.flowable.bpmn;

import org.junit.Test;
import org.unreal.flowable.FlowableClient;
import org.unreal.flowable.Version;
import org.unreal.flowable.api.EngineAPI;
import org.unreal.flowable.model.engine.EngineInfo;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2018/3/20.
 */
public class EngineAPITest {

    @Test
    public void testEngineInfo() throws ExecutionException, InterruptedException {
        EngineAPI engineAPI = FlowableClient.getInstance().connect(Constants.EndPoint, Constants.USERNAME, Constants.PASSWORD).getEngineAPI();
        assertNotNull(engineAPI);
        EngineInfo engineInfo = engineAPI.getEngineInfo();
        assertNotNull(engineInfo);
        assertEquals(Version.getSupportVersion(), engineInfo.getVersion());
    }

}
