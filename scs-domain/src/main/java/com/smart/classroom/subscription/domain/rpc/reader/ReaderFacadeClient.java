package com.smart.classroom.subscription.domain.rpc.reader;

import com.smart.classroom.subscription.domain.rpc.reader.vo.ReaderVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:19
 **/
public interface ReaderFacadeClient {

    ReaderVO queryById(Long readerId);
}
