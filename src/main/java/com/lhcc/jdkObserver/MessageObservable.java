package com.lhcc.jdkObserver;

import java.util.Observable;

/**
 * Created by Administrator on 2019/8/3.
 */
public class MessageObservable extends Observable{

    @Override
    public void notifyObservers(Object arg) {
        // 修改状态可以支持群发
        setChanged();
        // 调用父类notifyObservers
        super.notifyObservers(arg);

    }
}
