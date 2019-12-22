package com.lhcc.adapter;

import java.util.Map;

public class OrderService {

    public void forMap(Map map) {
        for (int i = 0; i< map.size(); i++) {
            String value = (String) map.get(i);
            System.out.println("value: " + value);
        }
    }
}
