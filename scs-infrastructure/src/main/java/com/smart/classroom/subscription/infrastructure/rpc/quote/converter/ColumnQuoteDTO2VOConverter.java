package com.smart.classroom.subscription.infrastructure.rpc.quote.converter;

import com.smart.classroom.misc.facade.biz.quote.response.ColumnQuoteDTO;
import com.smart.classroom.subscription.domain.rpc.quote.vo.ColumnQuoteVO;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 14:04
 **/
public class ColumnQuoteDTO2VOConverter {

    /**
     * 将DO转换成模型
     */
    public static ColumnQuoteVO convert(ColumnQuoteDTO columnQuoteDTO) {
        if (columnQuoteDTO == null) {
            return null;
        }

        return ColumnQuoteVO.builder()
                .id(columnQuoteDTO.getId())
                .createTime(columnQuoteDTO.getCreateTime())
                .updateTime(columnQuoteDTO.getUpdateTime())
                .columnId(columnQuoteDTO.getColumnId())
                .editorId(columnQuoteDTO.getEditorId())
                .price(columnQuoteDTO.getPrice())
                .status(columnQuoteDTO.getStatus())

                .build();
    }


}