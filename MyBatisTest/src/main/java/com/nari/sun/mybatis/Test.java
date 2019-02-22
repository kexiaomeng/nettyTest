package com.nari.sun.mybatis;

import java.lang.reflect.Constructor;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    public static final int NUM = 15000;

    public static int doubleval(int t) {
        for (int i =0;i<10000; i++);

        return 2*t;
    }


    public static void caculateSum() {
        long sum = 0;
        for (int i = 0; i < 100 ; i++) {
            sum += doubleval(i);
        }
    }

    public static void main(String args[]) {

        for (int i = 0; i < NUM; i++) {
            caculateSum();
        }

String threadClassName = "";
        try {
        Class<?> clazz = Class.forName(threadClassName);

            Constructor constructor = clazz.getConstructor(LinkedBlockingDeque.class, String.class);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
