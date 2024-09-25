package com.smart.classroom.subscription.domain.biz.order.repository.query;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.utility.enums.SortDirection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:20
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPageQuery {
    int pageNum = 1;
    int pageSize = 20;
    SortDirection orderCreateTime;
    SortDirection orderUpdateTime;
    Long readerId = null;
    Long columnId = null;
    Long columnQuoteId = null;
    Long paymentId = null;
    OrderStatus status = null;
}