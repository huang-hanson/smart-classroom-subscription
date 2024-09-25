package com.smart.classroom.subscription.application.rpc.payment.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 10:37
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEventPayload {

    /**
     * 支付单
     */
    private Long paymentId;

    /**
     * 订单编号
     */
    private String orderNo = null;

    /**
     * 支付方式 ALIPAY/WEIXIN 支付宝/微信
     */
    private String method = null;

    /**
     * 金额（单位：分）
     */
    private Long amount = null;

    /**
     * 支付状态 UNPAID/PAID/CLOSED 未支付/已支付/已关闭
     */
    private String status = null;

    /**
     * 时间
     */
    private String occurTime = null;
}