package org.unreal.flowable.request;

/**
 *
 */
public class PagingFilter extends AbstractParamsFilter {

    private String sort;

    private String order = "asc";

    private long start = 0;

    private long size = 10;

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
}
