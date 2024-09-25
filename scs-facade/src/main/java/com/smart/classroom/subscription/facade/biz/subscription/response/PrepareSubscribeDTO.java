package com.smart.classroom.subscription.facade.biz.subscription.response;

import com.smart.classroom.subscription.facade.biz.order.response.OrderDTO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 18:50
 **/
public class PrepareSubscribeDTO {

    /**
     * 相关的订单。
     */
    OrderDTO orderDTO;

    /**
     * 支付的一些token及信息
     */
    String thirdTransactionNo;

    /**
     * 支付时候的验证信息等。
     */
    String nonceStr;
}