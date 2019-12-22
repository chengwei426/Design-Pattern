package com.lhcc.handler.impl;

import com.lhcc.handler.GateWayHandler;

/**
 * Created by Administrator on 2019/7/11.
 */
public class BlacklistHandler extends GateWayHandler {

    @Override
    public void service() {
        System.out.println("第二关黑名单拦截判断....");
        nextService();
    }
}
