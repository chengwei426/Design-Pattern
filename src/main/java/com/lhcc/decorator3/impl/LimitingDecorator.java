package com.lhcc.decorator3.impl;

/**
 * Created by Administrator on 2019/7/14.
 */
public class LimitingDecorator extends AbstractDecorator {

    @Override
    public void service() {
        super.service();
        System.out.println("第三步 >>> 网关中新增Api限流操作....");
    }


}
