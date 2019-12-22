package com.lhcc.decorator2.impl;

import com.lhcc.decorator2.AbstractGatewayComponent;

/**
 * Created by Administrator on 2019/7/14.
 */
public class GatewayComponent extends AbstractGatewayComponent {
    @Override
    public void service() {
        System.out.println("第一步 >>> 网关中获取基本的操作实现....");
    }
}
