package com.smart.classroom.subscription.infrastructure.middleware.rocketmq;

import com.smart.classroom.subscription.domain.middleware.MqConsumer;
import com.smart.classroom.subscription.domain.middleware.MqConsumerListener;
import com.smart.classroom.subscription.utility.exception.UtilException;
import com.smart.classroom.subscription.utility.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.apis.consumer.PushConsumer;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现代码参考：https://rocketmq.apache.org/zh/docs/quickStart/01quickstart
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 17:15
 **/
@Slf4j
@Component
public class RockerMqConsumerImpl implements MqConsumer {

    // 接入点地址，需要设置成Proxy的地址和端口列表，一般是xxx:8081;xxx:8081。
    private final String ENDPOINT = "localhost:8081";

    // 消息发送的目标Topic名称，需要提前在RocketMQ中创建。
    private final String TOPIC = "SmartClassroomTopic";

    // 为消费者指定所属的消费者分组，Group需要提前创建。
    private final String CONSUMER_GROUP = "SmartClassroomConsumerGroup";

    //标识是否已完成启动，防止多次启动
    private boolean initialized = false;

    //所有的消费者。
    private final Map<String, PushConsumer> pushConsumers = new HashMap<>();

    /**
     * 这个方法只在系统启动的时候调用，系统可能调多次。
     */
    @EventListener(ContextRefreshedEvent.class)
    public void applicationRefreshed() {

        log.info("准备启动RocketMqConsumer");

        if (initialized) {
            return;
        } else {
            initialized = true;
        }
    }

    /**
     * 这个方法只在系统停止的时候调用
     */
    @EventListener(ContextStoppedEvent.class)
    public void applicationStopped() {

        log.info("RocketMqConsumer 系统停止钩子函数");

        try {
            for (Map.Entry<String, PushConsumer> entry : pushConsumers.entrySet()) {
                PushConsumer pushConsumer = entry.getValue();
                pushConsumer.close();
            }
        } catch (Exception e) {
            log.error("在关闭RocketMqConsumer的过程中遭遇错误", e);
        }

    }

    @Override
    public void listen(String eventName, MqConsumerListener mqConsumerListener) {

        if (StringUtil.isEmpty(eventName)) {
            throw new RuntimeException("事件名称不能为空");
        }

        if (this.pushConsumers.containsKey(eventName)) {
            throw new UtilException("{}已经完成了注册，请勿重复注册", eventName);
        }
    }
}