package com.lhcc.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Lambda: (参数列表) 左边 -> {右边 方法的主体}
 */
public class TestDemo {
    public static void main(String[] args) {
        FunctionIntefaceDemo.staticMethod("static");
        FunctionIntefaceDemo functionIntefaceDemo = (username,  age) -> {
            System.out.println(username + " >>>> " + age);
        };
        functionIntefaceDemo.addUser("zhangsan", 20);

        FunctionIntefaceDemo2 functionIntefaceDemo2 = () -> {
            System.out.println("删除数据");
            return "success";
        };
        functionIntefaceDemo2.delDate();

        FunctionIntefaceDemo2 functionIntefaceDemo3 = () -> "success";
        functionIntefaceDemo3.delDate();

        Runnable runnable = () -> {
            System.out.println("Lambda simplify Runnable...." + Thread.currentThread().getName());
        };
        new Thread(runnable).run();

        List<String> stringList = new ArrayList<>();
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
        stringList.forEach((item) -> {
            System.out.println(item);
        });

        stringList.forEach(System.out::println);

        // 当前日期
        LocalDate currentDate = LocalDate.now();
        // 当前时间
        LocalTime currentTime = LocalTime.now();
        // 当前具体时间
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-hh HH:mm:ss");
        System.out.println("current exec time is: " + dtf.format(dateTime));




    }
}
