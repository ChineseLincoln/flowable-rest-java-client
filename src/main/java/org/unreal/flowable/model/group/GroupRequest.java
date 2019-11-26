package org.unreal.flowable.model.group;

/**
 * Created by Administrator on 2018/3/22.
 */
public class GroupRequest {

    private String id;
    private String url;
    private String name;
    private String type;
    private boolean nameChanged;
    private boolean typeChanged;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNameChanged() {
        return nameChanged;
    }

    public void setNameChanged(boolean nameChanged) {
        this.nameChanged = nameChanged;
    }

    public boolean isTypeChanged() {
        return typeChanged;
    }

    public void setTypeChanged(boolean typeChanged) {
        this.typeChanged = typeChanged;
    }
}
