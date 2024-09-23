package com.smart.classroom.subscription.domain.biz.order.service;

import com.smart.classroom.subscription.domain.biz.order.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
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


}