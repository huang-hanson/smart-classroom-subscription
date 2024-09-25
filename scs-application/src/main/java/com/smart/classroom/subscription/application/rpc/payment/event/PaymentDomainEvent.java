package com.smart.classroom.subscription.application.rpc.payment.event;

import lombok.Getter;

/**
 * 定义领域事件类型。
 */
@Getter
public enum PaymentDomainEvent {

    PAYMENT_DOMAIN_EVENT_PAID("已支付");

    private final String dsecription;

    PaymentDomainEvent(String dsecription) {
        this.dsecription = dsecription;
    }

    public static String toString(PaymentDomainEvent status) {
        if (status == null) {
            return null;
        }
        return status.name();
    }

    public static PaymentDomainEvent toEnum(String s) {
        if (s == null){
            return null;
        }
        return PaymentDomainEvent.valueOf(s);
    }
}
