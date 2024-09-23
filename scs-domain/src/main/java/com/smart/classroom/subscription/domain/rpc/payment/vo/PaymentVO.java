package com.smart.classroom.subscription.domain.rpc.payment.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 11:30
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentVO {

    /**
     * 主键id
     */
    private Long id = null;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 更新时间
     */
    private Date updateTime = null;

    /**
     * 订单编号
     */
    private String orderNo = null;

    /**
     * 支付方式 ALIPAY/WEIXIN 支付宝/微信
     */
    private String method = null;

    /**
     * 支付平台订单号
     */
    private String thirdTransactionNo = null;

    /**
     * 金额（单位：分）
     */
    private Long amount = null;

    /**
     * 支付状态 UNPAID/PAID/CLOSED 未支付/已支付/已关闭
     */
    private String status = null;
}