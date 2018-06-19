package com.ebook.chapter01.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import sun.misc.Unsafe;

/*****
 * @Author zean
 * Created at 2018/5/10
 * @Email zxc200706@hotmail.com
 * operate with cas
 ****/

public class CasCounter {

    private AtomicInteger atomicInt = new AtomicInteger(0);
    private int i = 0;


    /***
     * count with atomic variable and use compareAndSet
     */
    private void safeCount() {
        while (true) {
            int i = atomicInt.get();
            boolean success = atomicInt.compareAndSet(i, ++i);
            if (success) {
                break;
            }
        }
    }


    private void count() {
        i++;
    }

    public static void main(String[] args) {
        final CasCounter counter = new CasCounter();
        List<Thread> threadList = new ArrayList<>(100);
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(() -> {
                for (int k = 0; k < 10000; k++) {
                    counter.count();
                    counter.safeCount();
                }
            });
            threadList.add(t);
        }
        for (Thread t : threadList) {
            t.start();
        }

        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println(counter.i);
        System.err.println(counter.atomicInt.get());

    }
}
