package org.unreal.flowable.config;

import org.unreal.flowable.model.Paging;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/3/20.
 */
public final class SyncCallAdapterFactory extends CallAdapter.Factory {

    private static final Set<Class<?>> supportSet = new HashSet<>();

    public SyncCallAdapterFactory() {
        supportSet.add(Paging.class);
        supportSet.add(List.class);
        supportSet.add(Response.class);
    }

    @Override
    public CallAdapter<?, ?> get(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (getRawType(type) != type && !supportSet.contains(getRawType(type))) {
            StringBuilder exceptionMsg = new StringBuilder();
            exceptionMsg.append("Return value unSupport \n\t ** Support List **\n\t");
            supportSet.forEach(s -> {
                exceptionMsg.append(s.getName());
                exceptionMsg.append("\n\t");
            });
            throw new IllegalStateException(exceptionMsg.toString());
        }
        return new SyncCallAdapter(type);
    }
}
