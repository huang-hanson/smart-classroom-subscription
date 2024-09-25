package com.smart.classroom.subscription.repository.orm.base;

import lombok.Data;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:32
 **/
@Data
public class BaseEntityDO {

    public final static String EMPTY_JSON_ARRAY = "[]";

    public final static String EMPTY_JSON_OBJECT = "{}";

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    /**
     * 更新时间
     */
    private Date updateTime = new Date();
}