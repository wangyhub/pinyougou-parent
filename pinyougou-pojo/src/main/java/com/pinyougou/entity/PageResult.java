package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @program: pinyougou-parent
 * @Date: 2020/7/29 13:37
 * @Author: wangy
 * @Description: 分页结果类
 */
public class PageResult implements Serializable {
    private long total; //记录总页数
    private List rows;  //当前页记录数

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
