package com.smart.classroom.subscription.repository.orm.order;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * 订单表
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:33
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrderDO extends BaseEntityDO {

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
     * 支付单id
     */
    private Long paymentId = null;

    /**
     * 价格（单位：分）
     */
    private Long price = null;

    /**
     * 状态 CREATED/PAID/SUBSCRIBED/CLOSED/CANCELED
     */
    private OrderStatus status = OrderStatus.CREATED;
}