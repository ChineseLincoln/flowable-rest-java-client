package org.unreal.flowable.request;

/**
 * Created by Administrator on 2018/3/22.
 */
public class GroupFilter extends AbstractParamsFilter {
    private String id;
    private String name;
    private String nameLike;
    private String type;
    private String member;
    private String potentialStarter;
    private String sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getPotentialStarter() {
        return potentialStarter;
    }

    public void setPotentialStarter(String potentialStarter) {
        this.potentialStarter = potentialStarter;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
