package com.smart.classroom.subscription.repository.mapper.order;

import com.github.pagehelper.Page;
import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.repository.mapper.base.BaseMapper;
import com.smart.classroom.subscription.repository.orm.order.OrderDO;
import com.smart.classroom.subscription.utility.enums.SortDirection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:30
 **/
@Mapper
@Repository
public interface OrderBaseMapper extends BaseMapper<OrderDO> {

    Page<OrderDO> page(@Param("pageNum") int pageNum,
                       @Param("pageSize") int pageSize,
                       @Param("orderCreateTime") SortDirection orderCreateTime,
                       @Param("orderCreateTime") SortDirection orderUpdateTime,
                       @Param("readerId") Long readerId,
                       @Param("columnId") Long columnId,
                       @Param("columnQuoteId") Long columnQuoteId,
                       @Param("paymentId") Long paymentId,
                       @Param("status") OrderStatus status);

}
