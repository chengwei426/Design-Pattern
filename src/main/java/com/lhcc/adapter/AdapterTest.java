package com.lhcc.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

    public static void main(String[] args) {
        OrderService service = new OrderService();

        List list = new ArrayList();
        list.add("112");
        list.add("2332");
        list.add("raa");
        ListAdapter listAdapter = new ListAdapter(list);
        service.forMap(listAdapter);

    }
}
