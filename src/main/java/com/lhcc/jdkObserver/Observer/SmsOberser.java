package com.lhcc.jdkObserver.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/8/3.
 */
public class SmsOberser implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("用户下单成功, 发送短信, 内容: " + arg);
    }
}
