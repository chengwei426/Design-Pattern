package com.lhcc.facade;

import com.lhcc.facade.entity.LogBean;
import com.lhcc.facade.impl.LogWriteFileServiceImpl;
import com.mysql.jdbc.log.Log;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.SetUtils;

import java.util.List;

public class ClassAdapter extends LogWriteFileServiceImpl implements LogWriteDbService {
    @Override
    public void writeDbFile(LogBean logBean) {
        // 1.从文件中读取日志文件
        List<LogBean> logBeans = readLogFile();
        // 2.写入到数据库中
        logBeans.add(logBean);
        System.out.println(">>>将数据写入到数据库中..");
        // 3.写入到本地文件中
        logWriteFile();

    }
}
