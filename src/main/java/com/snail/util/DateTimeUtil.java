package com.snail.util;

import java.util.Date;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by panyuanyuan on 2017/6/25.
 */
public class DateTimeUtil {

    //joda --> time

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将String类型的时间转换成date
     * @param dateTimeStr
     * @param pattern
     * @return
     */
    public static Date str2Date(String dateTimeStr, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(pattern);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    /**
     * 将date类型的日期转换成String数据类型
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String date2String(Date date, String pattern) {

        if(null == date) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(pattern);
    }
}
