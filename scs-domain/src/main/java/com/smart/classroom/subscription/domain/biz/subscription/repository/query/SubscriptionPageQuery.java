package com.smart.classroom.subscription.domain.biz.subscription.repository.query;

import com.smart.classroom.subscription.domain.biz.subscription.enums.SubscriptionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:44
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionPageQuery {

    int pageNum = 1;
    int pageSize = 20;

//    SortDirection orderCreateTime;
//    SortDirection orderUpdateTime;
    Long readerId;
    Long columnId;
    Long orderId;
    SubscriptionStatus status;

}