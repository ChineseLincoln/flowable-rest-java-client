package org.unreal.flowable.model.models;

import java.util.Date;

/**
 * Created by Administrator on 2018/3/22.
 */
public class Model {

    protected String id;
    protected String url;
    protected Date createTime;
    protected Date lastUpdateTime;
    protected String deploymentUrl;
    protected String tenantId;
    protected String sourceUrl;
    protected String sourceExtraUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getDeploymentUrl() {
        return deploymentUrl;
    }

    public void setDeploymentUrl(String deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceExtraUrl() {
        return sourceExtraUrl;
    }

    public void setSourceExtraUrl(String sourceExtraUrl) {
        this.sourceExtraUrl = sourceExtraUrl;
    }
}
