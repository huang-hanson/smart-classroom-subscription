package com.smart.classroom.subscription.facade.impl.biz.subscription;

import com.smart.classroom.subscription.facade.biz.subscription.SubscriptionReadFacade;
import com.smart.classroom.subscription.facade.biz.subscription.request.ReaderColumnQueryRequest;
import com.smart.classroom.subscription.facade.biz.subscription.request.SubscriptionPageRequest;
import com.smart.classroom.subscription.facade.biz.subscription.response.SubscriptionDTO;
import com.smart.classroom.subscription.facade.common.response.PagerResponse;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 10:29
 **/
@DubboService
public class SubscriptionReadFacadeImpl implements SubscriptionReadFacade {

    @Override
    public SubscriptionDTO queryByColumnAndReaderId(ReaderColumnQueryRequest readerColumnQueryRequest) {
        return null;
    }

    @Override
    public PagerResponse<SubscriptionDTO> page(SubscriptionPageRequest subscriptionPageRequest) {
        return null;
    }
}