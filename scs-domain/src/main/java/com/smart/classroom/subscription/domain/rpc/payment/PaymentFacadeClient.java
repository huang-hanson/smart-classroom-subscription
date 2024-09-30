package com.smart.classroom.subscription.domain.rpc.payment;

import com.smart.classroom.subscription.domain.rpc.payment.info.PaymentCreateInfo;
import com.smart.classroom.subscription.domain.rpc.payment.info.PreparePaymentInfo;
import com.smart.classroom.subscription.domain.rpc.payment.vo.PaymentVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:07
 **/
public interface PaymentFacadeClient {

    PaymentVO queryById(long paymentId);

    /**
     * 创建支付单
     * 同时返回可用于支付的物流
     *
     * @param paymentCreateInfo 创建支付订单信息
     * @return 支付订单
     */
    PreparePaymentInfo create(PaymentCreateInfo paymentCreateInfo);

    /**
     * 获取一个支付单对应的支付准备物料等信息。
     *
     * @param paymentId 支付订单id
     * @return 获取第一个支付订单的准备物料等信息
     */
    PreparePaymentInfo prepare(long paymentId);
}
