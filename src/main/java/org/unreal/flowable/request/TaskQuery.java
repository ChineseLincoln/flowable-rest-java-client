package org.unreal.flowable.request;

import java.util.List;

public class TaskQuery extends TaskFilter {

    private List<QueryVariable> taskVariables;

    private List<QueryVariable> processInstanceVariables;

    public List<QueryVariable> getTaskVariables() {
        return taskVariables;
    }

    public void setTaskVariables(List<QueryVariable> taskVariables) {
        this.taskVariables = taskVariables;
    }

    public List<QueryVariable> getProcessInstanceVariables() {
        return processInstanceVariables;
    }

    public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
        this.processInstanceVariables = processInstanceVariables;
    }
}
