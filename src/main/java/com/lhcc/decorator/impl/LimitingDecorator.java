package com.lhcc.decorator.impl;

import com.lhcc.decorator.AbstractGatewayComponent;

/**
 * Created by Administrator on 2019/7/14.
 */
public class LimitingDecorator extends AbstractDecorator {
    private AbstractGatewayComponent gatewayComponent;

    @Override
    public void service() {
        if (gatewayComponent != null) {
            gatewayComponent.service();
        }

        System.out.println("第三步 >>> 网关中新增Api限流操作....");
    }

    public void setGatewayComponent(AbstractGatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }
}
