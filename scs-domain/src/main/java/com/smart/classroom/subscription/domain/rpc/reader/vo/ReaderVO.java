package com.smart.classroom.subscription.domain.rpc.reader.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 13:17
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReaderVO {

    /**
     * 主键
     */
    private Long id = null;

    /**
     * 创建时间
     */
    private Date createTime = null;

    /**
     * 更新时间
     */
    private Date updateTime = null;

    /**
     * 用户名
     */
    private String username = null;
}