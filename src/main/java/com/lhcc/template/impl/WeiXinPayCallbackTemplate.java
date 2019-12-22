package com.lhcc.template.impl;

import com.lhcc.template.AbstractPayCallbackTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 模板方法模式-子类部分具体实现
 * Created by Administrator on 2019/7/13.
 */
@Component
public class WeiXinPayCallbackTemplate extends AbstractPayCallbackTemplate {

    @Override
    public String asyncService(Map<String, String> verifySignature) {
        return null;
    }

    @Override
    protected String resultFail() {
        return null;
    }

    @Override
    protected String resultSuccess() {
        return null;
    }

    @Override
    protected Map<String, String> verifySignature() {
        return null;
    }
}
