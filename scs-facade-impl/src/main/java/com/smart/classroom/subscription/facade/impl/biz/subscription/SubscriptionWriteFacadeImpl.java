package com.smart.classroom.subscription.facade.impl.biz.subscription;

import com.smart.classroom.subscription.application.biz.subscription.SubscriptionCommandAppService;
import com.smart.classroom.subscription.domain.biz.order.info.PrepareSubscribeInfo;
import com.smart.classroom.subscription.domain.biz.subscription.model.SubscriptionModel;
import com.smart.classroom.subscription.facade.biz.order.response.OrderDTO;
import com.smart.classroom.subscription.facade.biz.subscription.SubscriptionWriteFacade;
import com.smart.classroom.subscription.facade.biz.subscription.request.PrepareSubscribeRequest;
import com.smart.classroom.subscription.facade.biz.subscription.response.PrepareSubscribeDTO;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;
import com.smart.classroom.subscription.facade.impl.biz.order.converter.OrderModel2DTOConverter;
import com.smart.classroom.subscription.facade.impl.biz.subscription.converter.SubscriptionModel2DTOConverter;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 13:55
 **/
@DubboService
public class SubscriptionWriteFacadeImpl implements SubscriptionWriteFacade {

    @Resource
    SubscriptionCommandAppService subscriptionCommandAppService;

    /**
     * 发起订阅请求
     */
    public PrepareSubscribeDTO prepareSubscribe(PrepareSubscribeRequest request) {

        PrepareSubscribeInfo prepareSubscribeInfo = subscriptionCommandAppService.prepareSubscribe(request.getReaderId(), request.getColumnId(), request.getPayMethod());

        OrderDTO orderDTO = OrderModel2DTOConverter.convert(prepareSubscribeInfo.getOrderModel());

        PrepareSubscribeDTO prepareSubscribeDTO = new PrepareSubscribeDTO(
                orderDTO,
                prepareSubscribeInfo.getThirdTransactionNo(),
                prepareSubscribeInfo.getNonceStr()
        );

        return prepareSubscribeDTO;


    }


    /**
     * 支付成功消息补偿。
     */
    @Override
    public SubscriptionDTO compensatePaymentPaid(long paymentId) {

        SubscriptionModel subscriptionModel = subscriptionCommandAppService.paymentPaid(paymentId);

        return SubscriptionModel2DTOConverter.convert(subscriptionModel);
    }


}