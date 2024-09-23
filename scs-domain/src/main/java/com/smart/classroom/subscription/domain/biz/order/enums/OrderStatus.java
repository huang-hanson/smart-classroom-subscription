package com.smart.classroom.subscription.domain.biz.order.enums;

import lombok.Getter;

/**
 * @author hanson
 * @date 2024/9/22 22:53
 */
@Getter
public enum OrderStatus {

    CREATED("已支付"),
    PAID("已支付"),
    SUBSCRIBED("已订阅"),
    CLOSED("已关闭"),
    CANCELED("已取消"),
    ;

    private final String description;

    OrderStatus(String description){
        this.description = description;
    }

    public static String toString(OrderStatus orderStatus){
        if (orderStatus == null){
            return null;
        }
        return orderStatus.name(); //CREATED
    }

    public static OrderStatus toEnum(String s){
        if (s == null){
            return null;
        }
        return OrderStatus.valueOf(s);
    }

}
