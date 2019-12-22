package com.lhcc.observer;

/**
 * 抽象观察者
 * Created by Administrator on 2019/7/15.
 */
public interface IObserver {

    /**
     * 通知观察者消息
     * @param msg
     */
    void update(String msg);
}
