package com.smart.classroom.subscription.facade.biz.subscription.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 18:48
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionPageRequest implements Serializable {

    int pageNum = 1;
    int pageSize = 20;
    // 参考SortDirection枚举
    String orderCreateTime = null;
    //参考 SortDirection枚举
    String orderUpdateTime = null;

    Long readerId = null;
    Long columnId = null;
    Long orderId = null;
    String status = null;
}