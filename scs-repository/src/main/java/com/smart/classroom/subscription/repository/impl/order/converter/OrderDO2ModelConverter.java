package com.smart.classroom.subscription.repository.impl.order.converter;

import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;
import com.smart.classroom.subscription.repository.orm.order.OrderDO;

/**
 * 转换器
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 15:19
 **/
public class OrderDO2ModelConverter {

    /**
     * 将DO转换成模型
     */
    public static OrderModel convert(OrderDO orderDO) {
        if (orderDO == null){
            return null;
        }

        return OrderModel.builder()
                .id(orderDO.getId())
                .createTime(orderDO.getCreateTime())
                .updateTime(orderDO.getUpdateTime())
                .no(orderDO.getNo())
                .readerId(orderDO.getReaderId())
                .columnId(orderDO.getColumnId())
                .columnQuoteId(orderDO.getColumnQuoteId())
                .paymentId(orderDO.getPaymentId())
                .price(orderDO.getPrice())
                .status(orderDO.getStatus())
                .build();
    }
}