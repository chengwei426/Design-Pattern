package com.lhcc.strategy.context;

import com.lhcc.strategy.PayStrategy;
import com.lhcc.strategy.util.SpringUtils;
import org.apache.commons.lang.StringUtils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略上下文
 * Created by Administrator on 2019/7/4.
 */
public class PayContextStrategy {
    private ConcurrentHashMap<String, PaymentChannelEntity> payMap = new ConcurrentHashMap<String, PaymentChannelEntity>(){
        {
            this.put("YINLIAN_PAY", new PaymentChannelEntity("yinLian", "yinLianPayStrategy"));
            this.put("WEIXIN_PAY", new PaymentChannelEntity("weiXinPay", "weiXinPayStrategy"));
            this.put("ALI_PAY", new PaymentChannelEntity("aliPay", "aliPayStrategy"));
        }
    };

    class PaymentChannelEntity{
        private String channelId;

        private String strategyBeanId;

        PaymentChannelEntity() {
        }

        public PaymentChannelEntity(String channelId, String strategyBeanId) {
            this.channelId = channelId;
            this.strategyBeanId = strategyBeanId;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getStrategyBeanId() {
            return strategyBeanId;
        }

        public void setStrategyBeanId(String strategyBeanId) {
            this.strategyBeanId = strategyBeanId;
        }
    }

    /*public String toPayHtml(String payCode) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if(StringUtils.isNotBlank(payCode)) {
            PayStrategy payStrategy = StrategyFactory.getPayStrategy(payCode);
            if (payStrategy == null) {
                return "没有找到具体策略实现....";
            }

            return payStrategy.toPayHtml();

        }

        return "pay code 不能为空";
    }*/


    public String toPayHtml(String payCode) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if(StringUtils.isNotBlank(payCode)) {
            PaymentChannelEntity paymentChannelEntity = payMap.get(payCode);
            if (paymentChannelEntity == null) {
                return "没有找到具体策略实现....";
            }

            return SpringUtils.getBean(paymentChannelEntity.getStrategyBeanId(), PayStrategy.class).toPayHtml();
        }
        return "pay code 不能为空";
    }



}
