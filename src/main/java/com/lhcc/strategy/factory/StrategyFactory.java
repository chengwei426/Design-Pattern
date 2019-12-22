package com.lhcc.strategy.factory;

import com.lhcc.strategy.PayStrategy;
import com.lhcc.strategy.enumerate.PayEnum;

/**
 * Created by Administrator on 2019/7/4.
 */
public class StrategyFactory {
    // 使用策略工厂获取具体策略实现
   public static PayStrategy getPayStrategy(String strategyType) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       String className = PayEnum.valueOf(strategyType).getClassName();
       return (PayStrategy) Class.forName(className).newInstance();
   }
}
