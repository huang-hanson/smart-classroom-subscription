package com.smart.classroom.subscription.domain.biz.order.repository;

import com.smart.classroom.subscription.domain.biz.order.model.OrderModel;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 10:15
 **/
public interface OrderRepository {

    OrderModel queryById(long orderId);


    OrderModel queryByNo(String orderNo);


    //分页查询
//    Pager<OrderModel> page(OrderPageQuery orderPageQuery);

    OrderModel insert(OrderModel order);

    OrderModel updatePaymentId(OrderModel order);

    //查找某人关于某个专栏的非终态订单。
//    OrderModel queryNonFinalState(ReaderVO readerVO, ColumnVO columnVO);

    OrderModel updateStatus(OrderModel orderModel);
}