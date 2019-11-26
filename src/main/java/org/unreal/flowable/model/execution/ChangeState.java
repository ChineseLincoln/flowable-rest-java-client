package org.unreal.flowable.model.execution;

/**
 * Created by Administrator on 2018/3/22.
 */
public class ChangeState {
    private String cancelActivityId;
    private String startActivityId;

    public String getCancelActivityId() {
        return cancelActivityId;
    }

    public void setCancelActivityId(String cancelActivityId) {
        this.cancelActivityId = cancelActivityId;
    }

    public String getStartActivityId() {
        return startActivityId;
    }

    public void setStartActivityId(String startActivityId) {
        this.startActivityId = startActivityId;
    }
}
