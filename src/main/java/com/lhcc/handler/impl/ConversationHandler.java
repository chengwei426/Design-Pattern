package com.lhcc.handler.impl;

import com.lhcc.handler.GateWayHandler;

/**
 * Created by Administrator on 2019/7/11.
 */
public class ConversationHandler extends GateWayHandler {
    @Override
    public void service() {
        System.out.println("第三关用户会话拦截判断....");
        nextService();
    }
}
