package com.lhcc.template.factory;

import com.lhcc.strategy.util.SpringUtils;
import com.lhcc.template.AbstractPayCallbackTemplate;
import org.apache.commons.lang.StringUtils;

/**
 * Created by Administrator on 2019/7/13.
 */
public class TemplateFactory {

    public AbstractPayCallbackTemplate getPayCallbackTemplate(String templateId) {
        if (StringUtils.isBlank(templateId)) {
            return null;
        }
        AbstractPayCallbackTemplate payCallbackTemplate = SpringUtils.getBean(templateId, AbstractPayCallbackTemplate.class);


        return payCallbackTemplate;
    }

}
