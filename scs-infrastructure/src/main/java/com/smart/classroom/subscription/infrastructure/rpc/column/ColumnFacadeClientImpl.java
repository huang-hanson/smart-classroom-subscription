package com.smart.classroom.subscription.infrastructure.rpc.column;

import com.smart.classroom.subscription.domain.rpc.column.ColumnFacadeClient;
import com.smart.classroom.subscription.domain.rpc.column.vo.ColumnVO;
import org.springframework.stereotype.Service;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/26 18:59
 **/
@Service
public class ColumnFacadeClientImpl implements ColumnFacadeClient {


//    ColumnReaderFacade

    @Override
    public ColumnVO queryById(Long columnId) {
        return null;
    }
}