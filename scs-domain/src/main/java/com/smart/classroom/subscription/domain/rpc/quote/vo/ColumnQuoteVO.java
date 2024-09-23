package com.smart.classroom.subscription.domain.rpc.quote.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:12
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnQuoteVO {

    /**
     * 主键
     */
    private Long id = null;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 更新时间
     */
    private Date updateTime = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 编辑id
     */
    private Long editorId = null;

    /**
     * 价格（单位：分）
     */
    private Long price = null;

    /**
     * 报价状态 DISABLED/OK 未生效/已生效
     */
    private String status = null;
}