package org.unreal.flowable.model;

import java.util.ArrayList;
import java.util.List;

public class Paging<T> {
    // 总数
    private long total;
    // 起始索引
    private long start;
    // 单次条数
    private long size;
    // 排序字段
    private String sort;
    // 排序方式
    private String order;
    // 数据节点
    private List<T> data = new ArrayList<>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
