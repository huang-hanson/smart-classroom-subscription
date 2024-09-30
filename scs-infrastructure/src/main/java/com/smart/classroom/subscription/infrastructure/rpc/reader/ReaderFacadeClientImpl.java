package com.smart.classroom.subscription.infrastructure.rpc.reader;

import com.smart.classroom.misc.facade.biz.reader.ReaderReadFacade;
import com.smart.classroom.misc.facade.biz.reader.response.ReaderDTO;
import com.smart.classroom.subscription.domain.rpc.reader.ReaderFacadeClient;
import com.smart.classroom.subscription.domain.rpc.reader.vo.ReaderVO;
import com.smart.classroom.subscription.infrastructure.rpc.reader.converter.ReaderDTO2VOConverter;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 14:08
 **/
@Service
public class ReaderFacadeClientImpl implements ReaderFacadeClient {

    @DubboReference
    ReaderReadFacade readerReadFacade;

    @Override
    public ReaderVO queryById(long readerId) {

        ReaderDTO readerDTO = readerReadFacade.queryById(readerId);

        return ReaderDTO2VOConverter.convert(readerDTO);
    }
}