package com.smart.classroom.subscription.facade.biz.subscription.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/24 18:47
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReaderColumnQueryRequest implements Serializable {


    /**
     * 当前读者id
     */
    private long readerId;

    /**
     * 希望订阅的专栏
     */
    private long columnId;
}