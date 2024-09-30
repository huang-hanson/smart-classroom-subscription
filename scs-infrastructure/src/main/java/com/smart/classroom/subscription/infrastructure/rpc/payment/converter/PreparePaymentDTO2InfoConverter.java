package com.smart.classroom.subscription.infrastructure.rpc.payment.converter;

import com.smart.classroom.misc.facade.biz.payment.response.PreparePaymentDTO;
import com.smart.classroom.subscription.domain.rpc.payment.info.PreparePaymentInfo;
/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 14:00
 **/
public class PreparePaymentDTO2InfoConverter {

    /**
     * 将DO转换成模型
     */
    public static PreparePaymentInfo convert(PreparePaymentDTO preparePaymentDTO) {
        if (preparePaymentDTO == null) {
            return null;
        }

        return PreparePaymentInfo.builder()
                .paymentVO(PaymentDTO2VOConverter.convert(preparePaymentDTO.getPaymentDTO()))
                .thirdTransactionNo(preparePaymentDTO.getThirdTransactionNo())
                .nonceStr(preparePaymentDTO.getNonceStr())
                .build();
    }


}