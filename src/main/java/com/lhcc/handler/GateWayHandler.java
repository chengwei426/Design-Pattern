package com.lhcc.handler;

/**
 *
 * 责任链模式
 * Created by Administrator on 2019/7/11.
 */
public abstract class GateWayHandler {
    // 下一个handler
    protected GateWayHandler nextHandler;

    /**
     * 使用抽象类定义共同方法的执行
     */
    public abstract void service();

    /**
     * 执行下一个handler
     */
    protected void nextService() {
        if (nextHandler != null) {
            nextHandler.service();
        }
    }

    public void setNextGateWayHandler(GateWayHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
