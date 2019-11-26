package org.unreal.flowable.request;

import org.unreal.flowable.model.variables.Variables;

import java.util.List;

public class ActionTaskQuery {

    private String action;

    private List<Variables> variables;

    private String assignee;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
}
