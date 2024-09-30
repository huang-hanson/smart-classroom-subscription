package com.smart.classroom.subscription.infrastructure.rpc.reader.converter;

import com.smart.classroom.misc.facade.biz.reader.response.ReaderDTO;
import com.smart.classroom.subscription.domain.rpc.reader.vo.ReaderVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 14:07
 **/
public class ReaderDTO2VOConverter {

    /**
     * 将DO转换成模型
     */
    public static ReaderVO convert(ReaderDTO readerDTO) {
        if (readerDTO == null) {
            return null;
        }

        return ReaderVO.builder()
                .id(readerDTO.getId())
                .createTime(readerDTO.getCreateTime())
                .updateTime(readerDTO.getUpdateTime())
                .username(readerDTO.getUsername())
                .build();
    }


}