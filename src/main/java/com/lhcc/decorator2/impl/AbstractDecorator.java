package com.lhcc.decorator2.impl;

import com.lhcc.decorator2.AbstractGatewayComponent;

/**
 * Created by Administrator on 2019/7/14.
 */
public class AbstractDecorator  extends AbstractGatewayComponent {
    protected AbstractGatewayComponent gatewayComponent;

    @Override
    public void service() {

    }

    public void setGatewayComponent(AbstractGatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }
}
