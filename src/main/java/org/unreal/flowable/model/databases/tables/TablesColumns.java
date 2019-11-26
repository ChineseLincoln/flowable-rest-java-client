package org.unreal.flowable.model.databases.tables;

import java.util.List;

public class TablesColumns {

    /**
     * columnNames : ["ID_","REV_","TYPE_","NAME_"]
     * columnTypes : ["VARCHAR","INTEGER","VARCHAR","VARCHAR"]
     * tableName : ACT_RU_VARIABLE
     */
    private List<String> columnNames;
    private List<String> columnTypes;
    private String tableName;

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public void setColumnTypes(List<String> columnTypes) {
        this.columnTypes = columnTypes;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public List<String> getColumnTypes() {
        return columnTypes;
    }

    public String getTableName() {
        return tableName;
    }
}
