package com.smart.classroom.subscription.utility.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.classroom.subscription.utility.exception.UtilException;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 13:41
 **/
public class JsonUtil {

    public final static String EMPTY_JSON_ARRAY = "[]";
    public final static String EMPTY_JSON_OBJECT = "{}";

    public final static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        //遇到没有定义的字段，反序列化不要报错。
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 时间格式化
        objectMapper.setDateFormat(new SimpleDateFormat(DateUtil.DEFAULT_FORMAT));
    }

    public static <T> T toObject(String content, Class<T> clazz) {

        try {
            return objectMapper.readValue(content, clazz);
        } catch (IOException e) {
            throw new UtilException("JSON信息有误：{} {}", content, ExceptionUtils.getRootCauseMessage(e));
        }
    }

    //将对象转换成json字符串。
    public static String toJson(Object obj) {


        try {

            return objectMapper.writeValueAsString(obj);

        } catch (JsonProcessingException e) {
            throw new UtilException("转成JSON时出错：{}", ExceptionUtils.getRootCauseMessage(e));
        }
    }
}