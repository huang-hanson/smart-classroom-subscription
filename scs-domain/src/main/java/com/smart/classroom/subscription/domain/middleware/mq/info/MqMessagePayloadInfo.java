package com.smart.classroom.subscription.domain.middleware.mq.info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:47
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MqMessagePayloadInfo {

    String messageId;

    String content;

    String tag;

    String keys;
}