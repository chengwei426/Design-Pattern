package com.lhcc.facade.entity;

import lombok.Getter;
import lombok.Setter;


public class LogBean {
    /**
     * 日志ID
     */
    private String logId;
    /**
     * 日志内容
     */
    private String logText;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }
}
