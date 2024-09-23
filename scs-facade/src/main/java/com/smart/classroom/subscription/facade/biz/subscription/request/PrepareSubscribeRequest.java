package com.smart.classroom.subscription.facade.biz.subscription.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 14:15
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrepareSubscribeRequest {

    /**
     * 当前读者id
     */
    private Long readerId;

    /**
     * 希望订阅的专栏
     */
    private Long columnId;

    /**
     * 支付方式 支持 ALIPAY/WEIXIN
     */
    private String payMethod;
}