package com.smart.classroom.subscription.facade.impl.healthy;

import com.smart.classroom.subscription.facade.healthy.HealthyFacade;
import com.smart.classroom.subscription.utility.util.DateUtil;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Date;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 13:55
 **/
@DubboService
public class HealthyFacadeImpl implements HealthyFacade {

    @Override
    public String check() {
        return "Hello,你好. 我是smart-classroom-subscription,状态正常 现在时间：" + DateUtil.convertDateToString(new Date());
    }
}