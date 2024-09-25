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
public class SubscriptionModel2DOConverter {

    /**
     * 将DO转换成模型
     */
    public static SubscriptionDO convert(SubscriptionModel subscriptionModel) {
        if (subscriptionModel == null){
            return null;
        }

        SubscriptionDO subscriptionDO = SubscriptionDO.builder()
                .readerId(subscriptionModel.getReaderId())
                .columnId(subscriptionModel.getColumnId())
                .orderId(subscriptionModel.getOrderId())
                .status(subscriptionModel.getStatus())
                .build();

        subscriptionDO.setId(subscriptionModel.getId());
        subscriptionDO.setCreateTime(subscriptionModel.getCreateTime());
        subscriptionDO.setUpdateTime(subscriptionModel.getUpdateTime());

        return subscriptionDO;
    }
}