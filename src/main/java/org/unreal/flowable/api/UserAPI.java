package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.users.User;
import org.unreal.flowable.request.UpdateUserQuery;
import retrofit2.http.*;

import java.io.InputStream;
import java.util.Map;

public interface UserAPI {

    @GET("identity/users")
    Paging<User> getUsers(@QueryMap Map<String, Object> params);

    @GET("identity/users")
    Paging<User> getUsers();

    @PUT("identity/users/{userId}")
    User updateUsers(@Path("userId") String id,
                     @Body UpdateUserQuery updateUserQuery);

    @POST("identity/users")
    User createUsers(@Body UpdateUserQuery updateUserQuery);

    @DELETE("identity/users/{id}")
    String deleteUsers(@Path("id") String id);

    @GET("identity/users/{id}")
    User getUser(@Path("id") String id);

    @GET("identity/users/{userId}/picture")
    InputStream getUserPic(@Path("userId") String id);


}
