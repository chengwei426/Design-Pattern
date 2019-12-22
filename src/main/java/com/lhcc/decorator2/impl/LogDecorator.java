package com.lhcc.decorator2.impl;

/**
 * Created by Administrator on 2019/7/14.
 */
public class LogDecorator extends AbstractDecorator {

    @Override
    public void service() {
        if (this.gatewayComponent != null) {
            this.gatewayComponent.service();
        }
        System.out.println("第二步 >>> 网关中新增日志收集操作....");
    }
}
