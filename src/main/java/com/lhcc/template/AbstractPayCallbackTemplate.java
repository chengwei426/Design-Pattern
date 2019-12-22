package com.lhcc.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.Map;

/**
 * 模板方法模式
 * Created by Administrator on 2019/7/13.
 */
@Slf4j
public abstract class AbstractPayCallbackTemplate {

    /**
     * 定义共同行为的骨架
     * @return
     */
    public String asyncCallBack() {
        // 1. 验证参数和签名
        Map<String, String> verifySignature = verifySignature();
        // 2. 日志收集
        printPayLog(verifySignature);

        // 获取验证签名的状态
        String retCode = verifySignature.get("retCode");
        if (retCode != "200") {
            return resultFail();
        }
        // 3.  更改数据库状态并返回不同的支付结果

        return asyncService(verifySignature);
    }

    protected abstract String resultFail();

    protected abstract String resultSuccess();

    public abstract String asyncService(Map<String, String> verifySignature);

    /**
     * 使用多线程异步写入日志
     * @param verifySignature
     */
    @Async
    public void printPayLog(Map<String, String> verifySignature) {
        log.info("写入数据库.....verifySignature");
    }

    protected abstract Map<String,String> verifySignature();


}
