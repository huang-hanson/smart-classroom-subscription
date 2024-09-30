package com.smart.classroom.subscription.domain.middleware.mq;

import com.smart.classroom.subscription.domain.middleware.mq.info.MqSendResultInfo;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:51
 * MQ消息生产
 **/
public interface MqProducer {

    /**
     * 发送MQ消息
     * 消息的topic统一采用"SmartClassroomTopic"
     *
     * @param tags 消息的tags
     * @param keys 消息的Key字段是为了唯一标识消息的，方便运维排查问题。如果不设置Key，则无法定位消息丢失原因。
     * @param body 发送的消息体，在智慧课堂中只发送文本消息。
     */
    MqSendResultInfo send(String tags, String keys, String body);
}
