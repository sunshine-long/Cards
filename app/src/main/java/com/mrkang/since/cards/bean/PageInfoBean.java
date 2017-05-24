package com.mrkang.since.cards.bean;

/**
 * Created by administer on 2016/8/17.
 */

/**
 * total : 2
 * more : 1
 * current : 1
 * pageSize : 20
 */

public class PageInfoBean {
    private int total;
    private int more;
    private int current;
    private int pageSize;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMore() {
        return more;
    }

    public void setMore(int more) {
        this.more = more;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
