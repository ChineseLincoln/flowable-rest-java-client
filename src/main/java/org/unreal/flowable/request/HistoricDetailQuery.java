package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricDetailQuery extends PagingFilter {
    private String id;
    private String processInstanceId;
    private String executionId;
    private String activityInstanceId;
    private String taskId;
    private boolean selectOnlyFormProperties;
    private boolean selectOnlyVariableUpdates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getActivityInstanceId() {
        return activityInstanceId;
    }

    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean isSelectOnlyFormProperties() {
        return selectOnlyFormProperties;
    }

    public void setSelectOnlyFormProperties(boolean selectOnlyFormProperties) {
        this.selectOnlyFormProperties = selectOnlyFormProperties;
    }

    public boolean isSelectOnlyVariableUpdates() {
        return selectOnlyVariableUpdates;
    }

    public void setSelectOnlyVariableUpdates(boolean selectOnlyVariableUpdates) {
        this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
    }
}
