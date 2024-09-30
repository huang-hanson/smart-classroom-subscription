package com.smart.classroom.subscription.domain.middleware.mq;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:50
 * MQ消息订阅
 **/
public interface MqConsumer {


    /**
     * 监听某个"领域"下的某个"事件"消息。
     *
     * @param eventName 事件由 领域名前缀+事件构成. 需要上下游约定产出。
     * @param mqConsumerListener MQ消息订阅
     */
    void listen(String eventName,MqConsumerListener mqConsumerListener);
}
