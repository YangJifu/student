package com.yang.student.data_8;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date extends Exception{
    public static void main(String[] args) {
        //获取现在日期+时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当天日期加时间:"+now);
        LocalDate today = LocalDate.now();
        //只获取当前日期(只有日期)
        System.out.println("当天日期:"+today);
        LocalTime time = LocalTime.now();
        //获取当前时间(只有时间)
        System.out.println("当前时间:"+time);
        //获取年月日
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println(year+"-"+month+"-"+day);
        //处理特定日期
        LocalDate date = LocalDate.of(2021,2,22);
        System.out.println(date);
        //判断两个日期是否相等
        if(today.equals(date)){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        //计算一年前或一年后的日期
        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的日期 : " + previousYear);
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后的日期:"+nextYear);
        //clock时钟类

        // Returns the current time based on your system clock and set to UTC.
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock.millis());
        // Returns time based on system clock zone
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());

        //LocalDate类有两类方法isBefore()和isAfter()用于比较日期。
        //调用isBefore()方法时，如果给定日期小于当前日期则返回true。
        LocalDate tomorrow = LocalDate.of(2018,2,6);
        if(tomorrow.isAfter(today)){
            System.out.println("之后的日期:"+tomorrow);
        }

        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if(yesterday.isBefore(today)){
            System.out.println("之前的日期:"+yesterday);
        }
        //使用预定义的格式化工具解析或格式化日期
        String dayAfterTommorrow = "20180205";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dayAfterTommorrow+"  格式化后的日期为:  "+formatted);

        //字符串日期互转
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //日期转字符串
        String str = now.format(format1);
        System.out.println("日期转换为字符串:"+str);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //字符串转日期
        LocalDateTime date2 = LocalDateTime.parse(str,format2);
        System.out.println("时间+日期类型:"+date2);
    }
}
