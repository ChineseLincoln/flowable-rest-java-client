package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricVariableInstanceFilter extends AbstractParamsFilter {

    private Boolean excludeTaskVariables;
    private String taskId;
    private String executionId;
    private String processInstanceId;
    private String variableName;
    private String variableNameLike;

    public Boolean getExcludeTaskVariables() {
        return excludeTaskVariables;
    }

    public void setExcludeTaskVariables(Boolean excludeTaskVariables) {
        this.excludeTaskVariables = excludeTaskVariables;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableNameLike() {
        return variableNameLike;
    }

    public void setVariableNameLike(String variableNameLike) {
        this.variableNameLike = variableNameLike;
    }
}
