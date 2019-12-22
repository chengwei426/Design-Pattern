package com.lhcc.jdkObserver.test;

import com.lhcc.jdkObserver.MessageObservable;
import com.lhcc.jdkObserver.Observer.EmailObserver;
import com.lhcc.jdkObserver.Observer.SmsOberser;
import com.lhcc.jdkObserver.Observer.WeiChartObserver;

import java.util.Observable;

/**
 * Created by Administrator on 2019/8/3.
 */
public class JdkObserverTest {
    public static void main(String[] args) {
        // 主题
        Observable observable = new MessageObservable();
        // 注册观察者
        observable.addObserver(new SmsOberser());
        observable.addObserver(new EmailObserver());
        observable.addObserver(new WeiChartObserver());

        // 开始群发
        observable.notifyObservers("谢谢光临");
    }
}
