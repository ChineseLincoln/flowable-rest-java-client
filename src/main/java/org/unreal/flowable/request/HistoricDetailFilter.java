package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricDetailFilter {

    private String id;
    private String processInstanceId;
    private String executionId;
    private String activityInstanceId;
    private String taskId;
    private Boolean selectOnlyFormProperties;
    private Boolean selectOnlyVariableUpdates;

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

    public Boolean getSelectOnlyFormProperties() {
        return selectOnlyFormProperties;
    }

    public void setSelectOnlyFormProperties(Boolean selectOnlyFormProperties) {
        this.selectOnlyFormProperties = selectOnlyFormProperties;
    }

    public Boolean getSelectOnlyVariableUpdates() {
        return selectOnlyVariableUpdates;
    }

    public void setSelectOnlyVariableUpdates(Boolean selectOnlyVariableUpdates) {
        this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
    }
}
