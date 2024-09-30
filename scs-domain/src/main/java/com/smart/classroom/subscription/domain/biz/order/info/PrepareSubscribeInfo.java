package com.smart.classroom.subscription.domain.biz.order.info;

import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;
import lombok.*;

/**
 * @author hanson
 * @date 2024/9/22 23:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrepareSubscribeInfo {

    /**
     * 相关的订单。
     */
    OrderModel orderModel;

    /**
     * 支付的一些token及信息
     */
    String thirdTransactionNo;

    /**
     * 支付时候的验证信息等。
     */
    String nonceStr;

}
