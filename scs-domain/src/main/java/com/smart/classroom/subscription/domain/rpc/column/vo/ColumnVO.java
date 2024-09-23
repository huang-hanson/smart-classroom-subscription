package com.smart.classroom.subscription.domain.rpc.column.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/23 11:23
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColumnVO {

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
     * 专栏名称
     */
    private String name = null;

    /**
     * 作者id
     */
    private Long authorId = null;

    /**
     * 参考：ColumnStatus
     * 状态：NEW/OK/DISABLED 未发布/已生效/已禁用
     */
    private String status = null;
}