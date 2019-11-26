package org.unreal.flowable.config;

import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2018/3/20.
 */
public class SyncCallAdapter<T> implements CallAdapter<T, T> {

    private final Type responseType;

    SyncCallAdapter(Type responseType) {
        this.responseType = responseType;
    }

    @Override
    public Type responseType() {
        return this.responseType;
    }

    @Override
    public T adapt(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            }
            throw new HttpException(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new RuntimeException();
    }
}
