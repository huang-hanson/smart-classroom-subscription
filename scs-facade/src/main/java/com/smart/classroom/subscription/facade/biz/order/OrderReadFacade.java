package com.smart.classroom.subscription.facade.biz.order;

import com.smart.classroom.subscription.facade.biz.order.response.OrderDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 19:13
 **/
public interface OrderReadFacade {

    /**
     * 按照id查询
     */
    OrderDTO queryById(Long orderId);
}
