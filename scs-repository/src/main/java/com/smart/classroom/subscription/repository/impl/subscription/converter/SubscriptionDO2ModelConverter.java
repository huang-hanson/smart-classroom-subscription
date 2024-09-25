package com.smart.classroom.subscription.repository.impl.subscription.converter;

import com.smart.classroom.subscription.domain.biz.subscription.model.SubscriptionModel;
import com.smart.classroom.subscription.repository.orm.subscription.SubscriptionDO;

/**
 * 转换器
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 16:15
 **/
public class SubscriptionDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static SubscriptionModel convert(SubscriptionDO subscriptionDO) {
        if (subscriptionDO == null){
            return null;
        }

        return SubscriptionModel.builder()
                .id(subscriptionDO.getId())
                .createTime(subscriptionDO.getCreateTime())
                .updateTime(subscriptionDO.getUpdateTime())
                .readerId(subscriptionDO.getReaderId())
                .columnId(subscriptionDO.getColumnId())
                .orderId(subscriptionDO.getOrderId())
                .status(subscriptionDO.getStatus())
                .build();
    }
}