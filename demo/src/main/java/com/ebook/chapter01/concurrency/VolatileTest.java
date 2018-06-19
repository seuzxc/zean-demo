package com.ebook.chapter01.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/*****
 * @Author zean
 * Created at 2018/5/11
 * @Email zxc200706@hotmail.com
 *
 ****/

public class VolatileTest {
    final int aa[];
    final int bb;

    private ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
    int a = 0;
    volatile boolean flag = false;

    public VolatileTest(){
        aa= new int[]{1};
        bb=1;
    }
    public void writer(){
        flag = true;
        a =1;
    }

    public void reader(){
        if(flag){
            int i = a;
            map.put(String.valueOf(i),String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        List<Thread> threadList = new ArrayList<>(100);
        for (int j = 0; j < 500; j++) {
            Thread t = new Thread(() -> test.writer());
            threadList.add(t);
        }

        for (int j = 0; j < 500; j++) {
            Thread t = new Thread(() -> test.reader());
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

        System.err.println(test.map.size());
    }
}
