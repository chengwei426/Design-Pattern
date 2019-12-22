package com.lhcc.strategy.impl;

import com.lhcc.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/4.
 */
@Component
public class WeiXinPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用微信支付接口.....";
    }
}
