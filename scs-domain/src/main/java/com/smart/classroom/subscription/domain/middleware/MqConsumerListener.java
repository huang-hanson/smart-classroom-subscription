package com.smart.classroom.subscription.domain.middleware;

import com.smart.classroom.subscription.domain.middleware.info.MqMessagePayloadInfo;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:53
 * MQ消息订阅
 **/
public interface MqConsumerListener {

    /**
     * 订阅这。
     *
     * @param mqMessagePayloadInfo Mq投递过来的内容
     * @return true:表示消费成功，消息不再重新投递。 false:表示消费失败，消息会继续投递。
     */
    boolean consume(MqMessagePayloadInfo mqMessagePayloadInfo);
}
