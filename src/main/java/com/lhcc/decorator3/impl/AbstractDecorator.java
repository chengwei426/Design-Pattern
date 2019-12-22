package com.lhcc.decorator3.impl;

import com.lhcc.decorator3.AbstractGatewayComponent;

/**
 * Created by Administrator on 2019/7/14.
 */
public class AbstractDecorator  extends AbstractGatewayComponent {
    protected AbstractGatewayComponent gatewayComponent;

    public AbstractDecorator() {
    }

    public AbstractDecorator(AbstractGatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }

    @Override
    public void service() {
        if (this.gatewayComponent != null) {
            this.gatewayComponent.service();
        }
    }

    public void setGatewayComponent(AbstractGatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }
}
