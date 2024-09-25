package com.smart.classroom.subscription.repository.impl.order.converter;

import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;
import com.smart.classroom.subscription.repository.orm.order.OrderDO;

/**
 * 转换器
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 15:21
 **/
public class OrderModel2DOConverter {

    /**
     * 将模型转换成DO
     */
    public static OrderDO convert(OrderModel orderModel) {

        OrderDO orderDO = OrderDO.builder()
                .no(orderModel.getNo())
                .readerId(orderModel.getReaderId())
                .columnId(orderModel.getColumnId())
                .columnQuoteId(orderModel.getColumnQuoteId())
                .paymentId(orderModel.getPaymentId())
                .price(orderModel.getPrice())
                .status(orderModel.getStatus())
                .build();

        orderDO.setId(orderModel.getId());
        orderDO.setCreateTime(orderModel.getCreateTime());
        orderDO.setUpdateTime(orderModel.getUpdateTime());

        return orderDO;
    }
}