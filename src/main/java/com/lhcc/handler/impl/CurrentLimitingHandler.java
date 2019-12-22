package com.lhcc.handler.impl;

import com.lhcc.handler.GateWayHandler;

/**
 * Created by Administrator on 2019/7/11.
 */
public class CurrentLimitingHandler extends GateWayHandler {
    @Override
    public void service() {
        System.out.println("第一关, 接口限流");
        nextService();
    }
}
