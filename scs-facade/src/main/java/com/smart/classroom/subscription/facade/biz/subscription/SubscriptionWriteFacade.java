package com.smart.classroom.subscription.facade.biz.subscription;

import com.smart.classroom.subscription.facade.biz.subscription.request.PrepareSubscribeRequest;
import com.smart.classroom.subscription.facade.biz.subscription.response.PrepareSubscribeDTO;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/27 14:44
 **/
public interface SubscriptionWriteFacade {

    /**
     * 发起订阅请求
     */
    PrepareSubscribeDTO prepareSubscribe(PrepareSubscribeRequest request);


    /**
     * 支付成功消息补偿。
     */
    SubscriptionDTO compensatePaymentPaid(long paymentId);

}