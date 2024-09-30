package com.smart.classroom.subscription.utility.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间通用转换
 *
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 13:41
 **/
public class DateUtil {
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String SLASH_DATE_FORMAT = "yyyy/MM/dd";
    public static final String SLASH_DATE_TIME_FORMAT = "yyyy/MM/dd";
    public static final String TIME_FORMAT = "HH:mm";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm";
    public static final String COMPACT_DATE_FORMAT = "yyyyMMdd";
    public static final String COMPACT_DATETIME_FORMAT = "yyyyMMddHHmmss";
    public static final String COMPACT_FULL_DATETIME_FORMAT = "yyyyMMddHHmmssSSS";
    public static final String COMPACT_DATE_MINUTE_FORMAT = "yyyyMMddHHmm";
    public static final String COMPACT_DATE_HOUR_FORMAT = "yyyyMMddHH";
    public static final String YEAR_MONTH_FORMAT = "yyyy-MM";
    public static final String LOG_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    public static final String COMPACT_YEAR_MONTH_FORMAT = "yyyyMM";

    public static String convertDateToString(Date date) {

        return convertDateToString(date, DEFAULT_FORMAT);

    }

    public static String convertDateToString(Date date, String format) {
        SimpleDateFormat tempDate = new SimpleDateFormat(format);

        return tempDate.format(date);

    }
}