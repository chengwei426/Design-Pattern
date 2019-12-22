package com.lhcc.template.impl;

import com.lhcc.template.AbstractPayCallbackTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 模板方法模式-子类部分具体实现
 * Created by Administrator on 2019/7/13.
 */
@Slf4j
@Component
public class AliPayCallbackTemplate extends AbstractPayCallbackTemplate {
    @Override
    public String asyncService(Map<String, String> verifySignature) {
        log.info(">>>>>第三步asyncService()verifySignatureMap:{}", verifySignature);
        String paymentStatus = verifySignature.get("aliPayMentStatus");
        if (paymentStatus.equals("1")) {
            String aliPayOrderNumber = verifySignature.get("aliPayOrderNumber");
            log.info(">>>>orderNumber:{aliPayOrderNumber},已经支付成功 修改订单状态为已经支付...");
        }
        return resultSuccess();

    }

    @Override
    protected String resultFail() {
        return "AliPay Fail";
    }

    @Override
    protected String resultSuccess() {
        return "AliPay Success";
    }

    @Override
    protected Map<String, String> verifySignature() {
        //>>>>假设一下为银联回调报文>>>>>>>>>>>>>>>>
        log.info(">>>>>第一步 解析支付宝据报文.....verifySignature()");
        Map<String, String> verifySignature = new HashMap<>();
        verifySignature.put("price", "1399");
        verifySignature.put("orderDes", "充值蚂蚁课堂永久会员");
        // 支付状态为1表示为成功....
        verifySignature.put("aliPayMentStatus", "1");
        verifySignature.put("aliPayOrderNumber", "201910101011");
        // 解析报文是否成功 200 为成功..
        verifySignature.put("retCode", "200");
        return verifySignature;
    }
}
