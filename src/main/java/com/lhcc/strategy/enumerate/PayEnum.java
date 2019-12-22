package com.lhcc.strategy.enumerate;

/**
 * 策略枚举类: 存放策略的实现
 * Created by Administrator on 2019/7/4.
 */
public enum PayEnum {
    ALI_PAY("com.lhcc.strategy.impl.AliPayStrategy"),

    WEIXIN_PAY("com.lhcc.strategy.impl.WeiXinPayStrategy"),

    YINLIAN_PAY("com.lhcc.strategy.impl.YinLianPayStrategy");


    private String className;

    PayEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
