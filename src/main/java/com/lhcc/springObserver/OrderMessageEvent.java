package com.lhcc.springObserver;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2019/8/3.
 */
public class OrderMessageEvent extends ApplicationEvent {

    // 发送消息的内容
    private JSONObject jsonObject;

    public OrderMessageEvent(Object source, JSONObject jsonObject) {
        super(source);
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
}
