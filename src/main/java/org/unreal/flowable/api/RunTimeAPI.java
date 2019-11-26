package org.unreal.flowable.api;

import org.unreal.flowable.request.SignalsQuery;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RunTimeAPI {

    @POST("runtime/signals")
    Void createSignals(@Body SignalsQuery signalsQuery);
}
