package com.lhcc.jdk8;

/**
 * 接口中只有一个唯一的抽象方法, 该接口可以默认称作函数式接口]
 * 函数接口支持default和static修饰的方法,default方法可以被子类重写,static方法不可以被子类重写
 * 函数接口允许存在object的equals方法, 名称不能变
 */
@FunctionalInterface
public interface FunctionIntefaceDemo {
    void addUser(String username, Integer age);

    @Override
    boolean equals(Object obj);

    default void defaultMethod() {
        System.out.println("defaultMethod");
    }

    static void staticMethod(String type) {
        System.out.println("staticMethod >>>> " + type);
    }
}
