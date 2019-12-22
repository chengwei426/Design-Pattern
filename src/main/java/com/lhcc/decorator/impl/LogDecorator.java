package com.lhcc.decorator.impl;

import com.lhcc.decorator.AbstractGatewayComponent;

/**
 * Created by Administrator on 2019/7/14.
 */
public class LogDecorator extends AbstractDecorator {
    private AbstractGatewayComponent gatewayComponent;

    @Override
    public void service() {
        if (gatewayComponent != null) {
            gatewayComponent.service();
        }
        System.out.println("第二步 >>> 网关中新增日志收集操作....");
    }

    public void setGatewayComponent(AbstractGatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }
}
