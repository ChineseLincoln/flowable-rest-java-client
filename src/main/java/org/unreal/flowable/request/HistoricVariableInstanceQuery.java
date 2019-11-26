package org.unreal.flowable.request;

import org.unreal.flowable.model.variables.Variables;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public class HistoricVariableInstanceQuery extends PagingFilter {

    private List<Variables> variables ;

    public List<Variables> getVariables() {
        return variables;
    }

    public void setVariables(List<Variables> variables) {
        this.variables = variables;
    }
}
