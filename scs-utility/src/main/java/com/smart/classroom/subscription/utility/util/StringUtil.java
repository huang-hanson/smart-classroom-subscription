package com.smart.classroom.subscription.utility.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.helpers.MessageFormatter;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * 关于字符串的通用处理方法
 *
 * @author hanson.huang
 * @version V1.0
 * @ClassName StringUtil
 * @date 2024/9/25 10:47
 **/
@Slf4j
public class StringUtil extends StringUtils {

    public static String CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final Pattern NUMBER_PATTERN = Pattern.compile("^-?[1-9]\\d*\\.?\\d*|^-?0\\.\\d*[1-9]\\d*$");

    /**
     * 获取长度为n的随机字符串
     *
     * @param n 字符串长度
     * @return 一个长度为n的随机字符串
     */
    public static String randomString(int n) {
        String rawString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int rawLength = rawString.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int pos = new Random().nextInt(rawLength);
            sb.append(rawString.charAt(pos));
        }
        return sb.toString();
    }

    //类似于sl4j的字符串格式化.使用 {} 做占位符。
    public static String format(String messagePattern, Object... arguments) {
        return MessageFormatter.arrayFormat(messagePattern, arguments).getMessage();
    }

    /**
     * 生成一个uuid
     *
     * @return 一个唯一的uui
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

}