package org.unreal.flowable.request;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricProcessInstanceQuery extends HistoricProcessInstanceFilter {

    private List<String> processInstanceIds;
    private List<QueryVariable> variables;

    public List<String> getProcessInstanceIds() {
        return processInstanceIds;
    }

    public void setProcessInstanceIds(List<String> processInstanceIds) {
        this.processInstanceIds = processInstanceIds;
    }

    public List<QueryVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<QueryVariable> variables) {
        this.variables = variables;
    }
}
