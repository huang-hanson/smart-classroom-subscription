package com.smart.classroom.subscription.facade.common.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:22
 **/
@Data
@NoArgsConstructor
public class PagerResponse<T> implements Serializable {

    /**
     * 当前页码，1
     */
    private long pageNum;

    /**
     * 每页大小
     */
    private long pageSize;

    /**
     * 总条目数
     */
    private long totalItems;

    /**
     * 总页数
     */
    private long totalPages;

    private List<T> data;

    public PagerResponse(long pageNum, long pageSize, long totalItems, long totalPages, List<T> data) {
        if (pageSize <= 0) {
            pageSize = 10;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalItems = totalItems;
        this.totalPages = (long) Math.ceil(this.totalItems * 1.0 / this.pageSize);
        this.data = data;
    }
}