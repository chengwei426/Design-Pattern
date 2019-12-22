package com.lhcc.decorator2.impl;

/**
 * Created by Administrator on 2019/7/14.
 */
public class LimitingDecorator extends AbstractDecorator {

    @Override
    public void service() {
        if (this.gatewayComponent != null) {
            this.gatewayComponent.service();
        }

        System.out.println("第三步 >>> 网关中新增Api限流操作....");
    }


}
