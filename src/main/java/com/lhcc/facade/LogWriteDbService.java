package com.lhcc.facade;

import com.lhcc.facade.entity.LogBean;

public interface LogWriteDbService {
    void writeDbFile(LogBean logBean);
}
