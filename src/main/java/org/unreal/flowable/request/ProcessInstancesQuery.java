package org.unreal.flowable.request;

import java.util.List;

public class ProcessInstancesQuery extends ProcessInstanceFilter {

    private List<QueryVariable> variables;

    public List<QueryVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<QueryVariable> variables) {
        this.variables = variables;
    }
}
