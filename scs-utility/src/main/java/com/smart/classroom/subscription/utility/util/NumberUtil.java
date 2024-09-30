package com.smart.classroom.subscription.utility.util;

import java.util.Random;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/30 13:36
 **/
public class NumberUtil {

    /**
     * [a,b)的一个随机整数
     */
    public static int random(int start, int end) {

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        Random r = new Random();

        return r.nextInt(end - start) + start;
    }

}