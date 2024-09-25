package com.smart.classroom.subscription.utility.exception;

import com.smart.classroom.subscription.utility.util.StringUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 作为我们自定义异常的父类
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 17:25
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UtilException extends RuntimeException {

    protected ExceptionCode code;
    protected String message;

    public UtilException() {
        this(ExceptionCode.UNKNOWN);
    }

    public UtilException(String messagePattern, Object... arguments) {
        super(StringUtil.format(messagePattern, arguments));

        this.code = ExceptionCode.UNKNOWN;
        this.message = StringUtil.format(messagePattern, arguments);
    }

    public UtilException(ExceptionCode resultCode) {
        super(resultCode.getMessage());

        this.code = resultCode;
        this.message = resultCode.getMessage();
    }

    public UtilException(ExceptionCode resultCode, String messagePattern, Object... arguments) {
        super(StringUtil.format(messagePattern, arguments));

        this.code = resultCode;
        this.message = StringUtil.format(messagePattern, arguments);
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return StringUtil.format("{} code={} message={}", this.getClass().getSimpleName(), this.code, this.message);
    }
}