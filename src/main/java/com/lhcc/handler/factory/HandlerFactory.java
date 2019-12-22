package com.lhcc.handler.factory;

import com.lhcc.handler.impl.BlacklistHandler;
import com.lhcc.handler.impl.ConversationHandler;
import com.lhcc.handler.impl.CurrentLimitingHandler;

/**
 * Created by Administrator on 2019/7/11.
 */
public class HandlerFactory {
    public static CurrentLimitingHandler getFirstGateWayHandler() {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aa");
        context.getBean();
        BeanFactory*/

        // 第一关
        CurrentLimitingHandler currentLimitingHandler = new CurrentLimitingHandler();

        // 第二关
        BlacklistHandler blacklistHandler = new BlacklistHandler();
        currentLimitingHandler.setNextGateWayHandler(blacklistHandler);

        // 第三关
        ConversationHandler conversationHandler = new ConversationHandler();
        blacklistHandler.setNextGateWayHandler(conversationHandler);
        return currentLimitingHandler;
    }
}
