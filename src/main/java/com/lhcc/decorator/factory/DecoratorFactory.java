package com.lhcc.decorator.factory;

import com.lhcc.decorator.AbstractGatewayComponent;
import com.lhcc.decorator.impl.GatewayComponent;
import com.lhcc.decorator.impl.LimitingDecorator;
import com.lhcc.decorator.impl.LogDecorator;
import com.lhcc.strategy.util.SpringUtils;

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
