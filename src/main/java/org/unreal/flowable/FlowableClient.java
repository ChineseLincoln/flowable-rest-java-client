package org.unreal.flowable;

import okhttp3.OkHttpClient;
import org.apache.commons.io.IOUtils;
import org.unreal.flowable.api.*;
import org.unreal.flowable.config.AuthorizationInterceptor;
import org.unreal.flowable.config.ConverterFactory;
import org.unreal.flowable.config.SyncCallAdapterFactory;
import retrofit2.Retrofit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Administrator on 2018/3/20.
 */
public class FlowableClient {

    private static final AtomicReference<FlowableClient> instance = new AtomicReference<>(new FlowableClient());

    private static final AtomicReference<OkHttpClient> httpClient = new AtomicReference<>(null);

    private static final AtomicReference<Retrofit> retrofit = new AtomicReference<>(null);

    private static final AtomicBoolean isConnect = new AtomicBoolean(false);

    private FlowableClient() {
    }

    public static FlowableClient getInstance() {
        return instance.get();
    }

    public FlowableClient connect(String endpoint, String username, String password) {
        if (endpoint == null || endpoint.isEmpty()) {
            throw new IllegalArgumentException("Invalid url");
        }
        if (httpClient.get() == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new AuthorizationInterceptor(username, password));
            httpClient.compareAndSet(null, builder.build());
        }
        if (retrofit.get() == null) {
            retrofit.compareAndSet(null, new Retrofit.Builder()
                    .baseUrl(endpoint)
                    .addCallAdapterFactory(new SyncCallAdapterFactory())
                    .addConverterFactory(ConverterFactory.create())
                    .client(httpClient.get())
                    .build());
        }
        isConnect.compareAndSet(false, true);
        return this;
    }

    public DatabaseAPI getDataBaseAPI() {
        return this.getAPI(DatabaseAPI.class);
    }

    public DeploymentAPI getDeploymentAPI() {
        return this.getAPI(DeploymentAPI.class);

    }

    public EngineAPI getEngineAPI() {
        return this.getAPI(EngineAPI.class);
    }

    public ExecutionAPI getExecutionAPI() {
        return this.getAPI(ExecutionAPI.class);
    }

    public FormAPI getFormAPI() {
        return this.getAPI(FormAPI.class);
    }

    public GroupAPI getGroupAPI() {
        return this.getAPI(GroupAPI.class);
    }

    public HistoryAPI getHistoryAPI() {
        return this.getAPI(HistoryAPI.class);
    }

    public JobsAPI getJobsAPI() {
        return this.getAPI(JobsAPI.class);
    }

    public ModelAPI getModelAPI() {
        return this.getAPI(ModelAPI.class);
    }

    public ProcessDefinitionsAPI getProcessDefinitionsAPI() {
        return this.getAPI(ProcessDefinitionsAPI.class);
    }

    public ProcessInstancesAPI getProcessInstancesAPI() {
        return this.getAPI(ProcessInstancesAPI.class);
    }

    public RunTimeAPI getRunTimeAPI() {
        return this.getAPI(RunTimeAPI.class);
    }

    public TaskAPI getTaskAPI() {
        return this.getAPI(TaskAPI.class);
    }

    public UserAPI getUserAPI() {
        return this.getAPI(UserAPI.class);
    }

    private <T> T getAPI(Class<T> clazz) {
        if (!isConnect.get()) {
            throw new IllegalStateException("You must call connect method first");
        }

        return retrofit.get().create(clazz);
    }

    public static void main(String[] args) {
        FlowableClient connect = new FlowableClient().connect("http://127.0.0.1:8080/process-api/", "admin", "test");
//        File file = new File("C:\\Users\\Lincoln\\Documents\\alarm_flow.bpmn20.xml");
        // 创建 RequestBody，用于封装构建RequestBody
//        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file);

        // MultipartBody.Part  和后端约定好Key，这里的partName是用file
//        MultipartBody.Part body = MultipartBody.Part.createFormData("file", file.getName(), requestFile);

//        Deployment deployments = connect.getDeploymentAPI().createDeployments(body);
//        System.out.println("deployments = " + deployments.getUrl());
//        connect.getProcessInstancesAPI().getProcessDefinitions()
//                .getData()
//                .forEach(it->{
//                    System.out.println("it.getId() = " + it.getId());
//                });

//        ProcessInstanceStartByDefinitionKeyQuery processInstanceStartByDefinitionKeyQuery = new ProcessInstanceStartByDefinitionKeyQuery();
//        processInstanceStartByDefinitionKeyQuery.setBusinessKey("");
//        processInstanceStartByDefinitionKeyQuery.setProcessDefinitionKey("alarm_flow");
//        processInstanceStartByDefinitionKeyQuery.setTenantId("");
//        ArrayList<VariablesQuery> variable = new ArrayList<>(1);
//        VariablesQuery variablesQuery = new VariablesQuery();
//        variablesQuery.setName("users");
//        List<String> usersList = new ArrayList<>();
//        usersList.add("test");
//        usersList.add("test1");
//        variablesQuery.setValue(usersList);
//        variable.add(variablesQuery);
//        processInstanceStartByDefinitionKeyQuery.setVariables(variable);
//        ProcessInstances processInstances = connect.getProcessInstancesAPI().startProcessByProcessDefinitionKey(processInstanceStartByDefinitionKeyQuery);
//        System.out.println("processInstances = " + processInstances);
//        HashMap<String, String> request = new HashMap<>();
//        request.put("action", "activate");
//        connect.getProcessInstancesAPI()
//                .changeProcessDefinitionsState(
//                        "5bcdfd8e-0f2e-11ea-ae38-d0abd5554ec0",
//                        request);
        InputStream processDefinitionsDiagram = connect.getProcessInstancesAPI()
                .getProcessInstanceDiagram("5bcdfd8e-0f2e-11ea-ae38-d0abd5554ec0");
        try {
            System.out.println(Base64.getEncoder().encodeToString(IOUtils.toByteArray(processDefinitionsDiagram)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
