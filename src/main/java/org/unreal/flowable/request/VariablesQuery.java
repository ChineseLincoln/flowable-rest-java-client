package org.unreal.flowable.request;

public class VariablesQuery {
    /**
     * name : myVar
     * value : This is a variable
     */
    private String name;
    private Object value;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
