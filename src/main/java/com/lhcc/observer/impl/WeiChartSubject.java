package com.lhcc.observer.impl;

import com.lhcc.observer.IObserver;
import com.lhcc.observer.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/7/15.
 */
public class WeiChartSubject implements ISubject{

    private List<IObserver> observerList = new ArrayList<IObserver>();

    // private String msg;

    @Override
    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        // 调用观察者通知方法
        for (IObserver observer : observerList) {
            observer.update(msg);
        }
    }

    /*@Override
    public void setMessage(String msg) {
        this.msg = msg;
        notifyObserver();
    }*/
}
