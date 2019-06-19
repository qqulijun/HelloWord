package com.dayuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author dayuan
 * @Date 2019/6/14 9:19
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i));
        }
        long start = System.currentTimeMillis();
        list.parallelStream().forEach(s -> {
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        /*for (String s : list) {
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.toString();
        }*/
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }
}
