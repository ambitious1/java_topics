package com.multithreading.parellelism;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void run() {
        List<Double> rows = Arrays.asList(2.0, 3.0, 4.0, 7.0, 10.0, 11.0, 22.0, 19.0);

        rows.parallelStream().forEach(i -> showNum(i));

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream()
                .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
    }

    static void showNum(double val) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(val);
    }

}
