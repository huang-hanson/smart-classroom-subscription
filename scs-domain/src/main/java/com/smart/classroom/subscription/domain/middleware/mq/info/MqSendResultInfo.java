package com.smart.classroom.subscription.domain.middleware.mq.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:48
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MqSendResultInfo {

    /**
     * mq发送是否成功
     */
    private boolean success;

    /**
     * 发送的消息id
     */
    private String messageId;

    /**
     * 如果发送失败，错误消息是什么
     */
    private String msg;
}