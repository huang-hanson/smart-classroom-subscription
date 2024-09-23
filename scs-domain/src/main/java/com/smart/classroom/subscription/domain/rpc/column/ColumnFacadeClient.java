package com.smart.classroom.subscription.domain.rpc.column;

import com.smart.classroom.subscription.domain.rpc.column.vo.ColumnVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 11:26
 **/
public interface ColumnFacadeClient {

    ColumnVO queryById(Long columnId);
}
