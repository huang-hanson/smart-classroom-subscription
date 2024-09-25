package com.smart.classroom.subscription.utility.enums;

import lombok.Getter;

/**
 * @author hanson.huang
 * @version V1.0
 * @date 2024/9/25 14:39
 **/
@Getter
public enum SortDirection {

    ASC("升序"),
    DESC("降序");

    private final String description;

    SortDirection(String description) {
        this.description = description;
    }

    public static String toString(SortDirection sortDirection) {
        if (sortDirection == null){
            return null;
        }
        return sortDirection.name();
    }

    public static SortDirection toEnum(String sortDirection) {
        if (sortDirection == null){
            return null;
        }
        return SortDirection.valueOf(sortDirection);
    }

}