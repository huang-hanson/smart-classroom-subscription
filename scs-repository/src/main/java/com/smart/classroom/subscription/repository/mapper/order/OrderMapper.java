package com.smart.classroom.subscription.repository.mapper.order;

import com.smart.classroom.subscription.domain.biz.order.enums.OrderStatus;
import com.smart.classroom.subscription.repository.orm.order.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:43
 **/
@Mapper
@Repository
public interface OrderMapper extends OrderBaseMapper {

    List<OrderDO> queryByReaderIdAndColumnIdAndStatuses(
            @Param("readerId") Long readerId,
            @Param("columnId") Long columnId,
            @Param("statuses") List<OrderStatus> statuses
    );

    OrderDO queryByNo(@Param("orderNo") String orderNo);

    int updateStatus(@Param("orderId") Long orderId, @Param("status") OrderStatus status);
}
