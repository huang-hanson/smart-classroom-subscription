package com.smart.classroom.subscription.repository.mapper.subscription;

import com.smart.classroom.subscription.repository.orm.subscription.SubscriptionDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 15:00
 **/
@Mapper
@Repository
public interface SubscriptionMapper extends SubscriptionBaseMapper{

    SubscriptionDO queryByReaderIdAndColumnId(@Param("readerId") Long readerId, @Param("columnId") Long columnId);
}
