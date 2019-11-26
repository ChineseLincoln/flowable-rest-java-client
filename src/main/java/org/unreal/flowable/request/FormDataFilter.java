package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class FormDataFilter extends AbstractParamsFilter {
    private String taskId;
    private String processDefinitionId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }
}
