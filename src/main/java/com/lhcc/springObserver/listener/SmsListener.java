package com.lhcc.springObserver.listener;

import com.lhcc.springObserver.OrderMessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/8/3.
 */
@Component
public class SmsListener implements ApplicationListener<OrderMessageEvent> {

    @Override
    @Async
    public void onApplicationEvent(OrderMessageEvent orderMessageEvent) {
        System.out.println("开始发送短信的内容: " + orderMessageEvent.getJsonObject().toJSONString());
    }
}
