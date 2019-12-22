package com.lhcc.observer.test;

import com.lhcc.observer.ISubject;
import com.lhcc.observer.impl.UserObserver;
import com.lhcc.observer.impl.WeiChartSubject;

/**
 * Created by Administrator on 2019/7/15.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ISubject weiChartSubject = new WeiChartSubject();
        weiChartSubject.addObserver(new UserObserver("小军"));
        weiChartSubject.addObserver(new UserObserver("小红"));
        weiChartSubject.notifyObserver("成功操作!!!!");
    }

}
