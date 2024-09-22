package com.smart.classroom.subscription.domain.base.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工成员
 * @author hanson
 * @date 2024/9/22 22:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    /**
     * 工号
     */
    private String workNo;

    /**
     * 花名
     */
    private String nickname;
}
