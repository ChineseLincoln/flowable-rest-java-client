package org.unreal.flowable.api;

import org.unreal.flowable.model.Paging;
import org.unreal.flowable.model.databases.tables.Tables;
import org.unreal.flowable.model.databases.tables.TablesColumns;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface DatabaseAPI {

    @GET("management/tables")
    List<Tables> getTables();

    @GET("management/tables/{tableName}")
    Tables getTables(@Path("tableName") String tableName);

    @GET("management/tables/{tableName}/columns")
    TablesColumns getTablesColumns(@Path("tableName") String tableName);

    @GET("management/tables/{tableName}/data")
    Paging<Map<String,Object>> getTableData(@Path("tableName") String tableName,
                                    @QueryMap Map<String,String> request);
}
