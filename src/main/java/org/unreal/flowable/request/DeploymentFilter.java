package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/21.
 */
public class DeploymentFilter extends AbstractParamsFilter {
    private String name;
    private String nameLike;
    private String category;
    private String categoryNotEquals;
    private String tenantId;
    private String tenantIdLike;
    private boolean withoutTenantId;
    private String sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryNotEquals() {
        return categoryNotEquals;
    }

    public void setCategoryNotEquals(String categoryNotEquals) {
        this.categoryNotEquals = categoryNotEquals;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantIdLike() {
        return tenantIdLike;
    }

    public void setTenantIdLike(String tenantIdLike) {
        this.tenantIdLike = tenantIdLike;
    }

    public boolean isWithoutTenantId() {
        return withoutTenantId;
    }

    public void setWithoutTenantId(boolean withoutTenantId) {
        this.withoutTenantId = withoutTenantId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
