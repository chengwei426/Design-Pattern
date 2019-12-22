package com.lhcc.observer;

/**
 * Created by Administrator on 2019/7/15.
 */
public interface ISubject {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(IObserver observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(IObserver observer);

    /**
     * 通知消息
     */
    void notifyObserver(String msg);

    /**
     * 设置通知观察者的消息
     * @param msg
     */
    //void setMessage(String msg);
}
