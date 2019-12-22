package com.lhcc.decorator3.factory;

import com.lhcc.decorator3.AbstractGatewayComponent;
import com.lhcc.decorator3.impl.GatewayComponent;
import com.lhcc.decorator3.impl.LimitingDecorator;
import com.lhcc.decorator3.impl.LogDecorator;

/**
 * Created by Administrator on 2019/7/14.
 */
public class DecoratorFactory {

    public static AbstractGatewayComponent getGatewayComponent() {
        // 1. 创建日志收集装饰类
        LogDecorator logDecorator = new LogDecorator();
        LimitingDecorator limitingDecorator = new LimitingDecorator();
        limitingDecorator.setGatewayComponent(logDecorator);
        // 2. 创建被装饰的实现类
        GatewayComponent gatewayComponent = new GatewayComponent();
        logDecorator.setGatewayComponent(gatewayComponent);
        return limitingDecorator;
    }

    public static void main(String[] args) {
        AbstractGatewayComponent gatewayComponent = getGatewayComponent();
        gatewayComponent.service();
    }

}
