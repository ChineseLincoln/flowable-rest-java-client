package org.unreal.flowable.api;

import org.unreal.flowable.model.engine.EngineInfo;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface EngineAPI {

    @GET("management/engine")
    EngineInfo getEngineInfo();

    @GET("management/properties")
    String getEngineProperties();
}
