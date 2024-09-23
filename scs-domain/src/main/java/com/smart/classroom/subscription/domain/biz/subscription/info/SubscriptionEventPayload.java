package com.smart.classroom.subscription.domain.biz.subscription.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:37
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionEventPayload {

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
     * 状态CREATED/OK/DISABLED
     */
    private String status = null;

    /**
     * 时间
     */
    private Date occurTime = null;
}