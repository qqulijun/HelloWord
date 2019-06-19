package com.dayuan;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String aa = "aa";
        List list = new ArrayList();
        list.add(aa);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
