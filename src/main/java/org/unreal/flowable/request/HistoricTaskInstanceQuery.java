package org.unreal.flowable.request;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricTaskInstanceQuery extends HistoricTaskInstanceFilter {
    private List<QueryVariable> taskVariables;
    private List<QueryVariable> processVariables;

    public List<QueryVariable> getTaskVariables() {
        return taskVariables;
    }

    public void setTaskVariables(List<QueryVariable> taskVariables) {
        this.taskVariables = taskVariables;
    }

    public List<QueryVariable> getProcessVariables() {
        return processVariables;
    }

    public void setProcessVariables(List<QueryVariable> processVariables) {
        this.processVariables = processVariables;
    }
}
