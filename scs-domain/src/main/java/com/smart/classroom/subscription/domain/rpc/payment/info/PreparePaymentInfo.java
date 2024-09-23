package com.smart.classroom.subscription.domain.rpc.payment.info;

import com.smart.classroom.subscription.domain.rpc.payment.vo.PaymentVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 11:29
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreparePaymentInfo {

    /**
     * 支付单
     */
    PaymentVO paymentVO;

    /**
     * 订单号
     */
    String orderNo;

    /**
     * 支付的一些token信息
     */
    String thirdTransactionNo;

    /**
     * 支付时验证信息等
     */
    String nonceStr;
}