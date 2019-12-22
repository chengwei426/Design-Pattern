package com.lhcc.observer.impl;

import com.lhcc.observer.IObserver;

/**
 * Created by Administrator on 2019/7/15.
 */
public class UserObserver implements IObserver {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    public UserObserver() {
    }

    @Override
    public void update(String msg) {
        System.out.println("name >>> " + this.name + ", msg >>> " + msg);
    }
}
