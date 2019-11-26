package org.unreal.flowable.request;

public class CreateUserQuery extends UpdateUserQuery {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
