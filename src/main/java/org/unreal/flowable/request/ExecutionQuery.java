package org.unreal.flowable.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public class ExecutionQuery extends ExecutionFilter {

    private List<QueryVariable> variables = new ArrayList<>();

    private List<QueryVariable> processInstanceVariables = new ArrayList<>();

    public List<QueryVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<QueryVariable> variables) {
        this.variables = variables;
    }

    public List<QueryVariable> getProcessInstanceVariables() {
        return processInstanceVariables;
    }

    public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
        this.processInstanceVariables = processInstanceVariables;
    }

    @Override
    public Map<String, Object> toMap() {
        throw new UnsupportedOperationException();
    }
}
