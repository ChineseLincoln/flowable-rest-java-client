package org.unreal.flowable.api;

import org.unreal.flowable.model.event.EventSubscription;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface EventSubscriptionAPI {

    @GET("runtime/event-subscriptions")
    List<EventSubscription> getEventSubscriptions();

    @GET("runtime/event-subscriptions")
    List<EventSubscription> getEventSubscriptions(@QueryMap Map<String, Object> params);

    @GET("runtime/event-subscriptions/{eventSubscriptionId}")
    EventSubscription getEventSubscription(@Path("eventSubscriptionId") String eventSubscriptionId);
}
