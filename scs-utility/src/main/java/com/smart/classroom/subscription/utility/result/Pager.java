package com.smart.classroom.subscription.utility.result;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 15:39
 **/

@Data
@NoArgsConstructor
public class Pager<T> {

    // 允许最大页数
    private static final int MAX_PAGE_NUMBER = 1000;

    // 批处理时每次页数
    private static final int HANDLE_PAGE_SIZE = 500;

    //当前页码。 1基
    private long pageNum;

    //每页的大小。
    private long pageSize;

    // 总条目数
    private long totalItems;

    //总页数
    private long totalPages;

    private List<T> data;

    public Pager(long pageNum, long pageSize, long totalItems, List<T> data){
        if (pageSize <= 0){
            pageSize = 10;
        }

        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalItems = totalItems;
        this.totalPages = (long) Math.ceil(this.totalItems * 1.0 / this.pageSize);
        this.data = data;
    }
}