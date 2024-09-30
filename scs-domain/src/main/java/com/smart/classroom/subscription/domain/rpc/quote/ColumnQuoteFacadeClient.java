package com.smart.classroom.subscription.domain.rpc.quote;

import com.smart.classroom.subscription.domain.rpc.quote.vo.ColumnQuoteVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:15
 **/
public interface ColumnQuoteFacadeClient {

    ColumnQuoteVO queryById(long columnQuoteId);

    ColumnQuoteVO queryByColumnId(long columnId);
}
