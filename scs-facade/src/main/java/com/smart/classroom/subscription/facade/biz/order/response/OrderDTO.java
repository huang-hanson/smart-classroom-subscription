package com.smart.classroom.subscription.facade.biz.order.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 18:56
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 修改时间
     */
    private Date updateTime = null;

    /**
     * 订单唯一编号，整个系统唯一，带有前缀
     */
    private String no = null;

    /**
     * 读者id
     */
    private Long readerId = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 专栏报价id
     */
    private Long columnQuoteId = null;

    /**
     * 支付单Id
     */
    private Long paymentId = null;

    /**
     * 价格（单位：分）
     */
    private Long price = null;

    /**
     * 状态 CREATED/PAID/SUBSCRIBED/CLOSED/CANCELED
     */
    private String status = null;
}