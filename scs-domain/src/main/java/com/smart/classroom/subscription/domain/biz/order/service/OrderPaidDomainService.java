package com.smart.classroom.subscription.domain.biz.order.service;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;
import com.smart.classroom.subscription.domain.biz.order.repository.OrderRepository;
import com.smart.classroom.subscription.domain.rpc.payment.PaymentFacadeClient;
import com.smart.classroom.subscription.domain.rpc.quote.ColumnQuoteFacadeClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 准备订单 领域服务
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:23
 **/
@Slf4j
@Service
public class OrderPaidDomainService {


    @Resource
    OrderRepository orderRepository;

    @Resource
    ColumnQuoteFacadeClient columnQuoteFacadeClient;

    @Resource
    PaymentFacadeClient paymentFacadeClient;


    /**
     * 更新订单状态至已支付。
     */
    public OrderModel orderPaid(OrderModel orderModel) {

        //更新状态
        orderModel.setStatus(OrderStatus.PAID);
        orderModel = orderRepository.updateStatus(orderModel);

        log.info("订单id={} no={}状态已更新成PAID", orderModel.getId(), orderModel.getNo());


        return orderModel;

    }

}