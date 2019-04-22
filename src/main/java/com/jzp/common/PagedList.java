package com.jzp.common;

import java.util.Iterator;
import java.util.List;

/**
 * 分页查询结果集封装类型
 *
 * @param <T> 行对象
 * @author Hongyi Zheng
 * @date 2019/4/22
 */
public class PagedList<T> implements Iterable<T> {

    /**
     * 结果条数
     */
    private long total;
    /**
     * 每行的数据
     */
    private List<T> rows;


    public PagedList(List<T> rows, long total) {
        this.rows = rows;
        this.total = total;
    }


    /**
     * 获取总条数
     */
    public long getTotal() {
        return total;
    }

    /**
     * 获取结果记录
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * 获取指定下标的结果记录
     */
    public T get(int index) {
        return rows.get(index);
    }


    @Override
    public Iterator<T> iterator() {
        return rows.iterator();
    }

}
