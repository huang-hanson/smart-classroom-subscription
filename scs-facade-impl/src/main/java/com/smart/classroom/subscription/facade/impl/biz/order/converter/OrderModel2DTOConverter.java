package com.smart.classroom.subscription.facade.impl.biz.order.converter;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;
import com.smart.classroom.subscription.facade.biz.order.response.OrderDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 19:29
 * 转换器
 **/
public class OrderModel2DTOConverter {

    public static OrderDTO convert(OrderModel orderModel) {
        if (orderModel == null){
            return null;
        }

        return OrderDTO.builder()
                .id(orderModel.getId())
                .createTime(orderModel.getCreateTime())
                .updateTime(orderModel.getUpdateTime())
                .no(orderModel.getNo())
                .readerId(orderModel.getReaderId())
                .columnId(orderModel.getColumnId())
                .columnQuoteId(orderModel.getColumnQuoteId())
                .paymentId(orderModel.getPaymentId())
                .price(orderModel.getPrice())
                .status(OrderStatus.toString(orderModel.getStatus()))
                .build();
    }

}