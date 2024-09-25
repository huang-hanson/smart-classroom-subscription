package com.smart.classroom.subscription.facade.biz.subscription;

import com.smart.classroom.subscription.facade.biz.subscription.request.ReaderColumnQueryRequest;
import com.smart.classroom.subscription.facade.biz.subscription.request.SubscriptionPageRequest;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;
import com.smart.classroom.subscription.facade.common.response.PagerResponse;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 19:15
 **/
public interface SubscriptionReadFacade {

    /**
     * 查找某个读者关于某个专栏的订阅情况
     */
    SubscriptionDTO queryByColumnAndReaderId(ReaderColumnQueryRequest readerColumnQueryRequest);

    /**
     * 查找订阅情况分页
     */
    PagerResponse<SubscriptionDTO> page(SubscriptionPageRequest subscriptionPageRequest);
}
