package com.smart.classroom.subscription.repository.orm.subscription;

import com.smart.classroom.subscription.domain.biz.subscription.enums.SubscriptionStatus;
import com.smart.classroom.subscription.repository.orm.base.BaseEntityDO;
import lombok.*;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:56
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SubscriptionDO extends BaseEntityDO {

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