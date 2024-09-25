package com.smart.classroom.subscription.domain.biz.subscription.model;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.domain.biz.subscription.enums.SubscriptionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:40
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionModel {

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
     * 读者id
     */
    private Long readerId = null;

    /**
     * 专栏id
     */
    private Long columnId = null;

    /**
     * 订单id
     */
    private Long orderId = null;

    /**
     * 状态 CREATED/OK/DISABLED
     */
    private SubscriptionStatus status = SubscriptionStatus.CREATED;
}