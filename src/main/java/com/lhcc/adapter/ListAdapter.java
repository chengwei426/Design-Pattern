package com.lhcc.adapter;

import java.util.HashMap;
import java.util.List;

public class ListAdapter extends HashMap {
    // 目标对象新版本
    private List list;

    public ListAdapter(List list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(Object key) {
        return list.get(Integer.valueOf(key.toString()).intValue());
    }
}
