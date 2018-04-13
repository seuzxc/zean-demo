package com.ebook.chapter03.designpattern.singleton;

import java.util.Vector;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/13
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class VolatileTest {

    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws Exception{
        final VolatileTest test = new VolatileTest();
        Vector<Thread> vec = new Vector<>();
        for(int i=0;i<10;i++){
            Thread t = new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            };
            vec.add(t);
            t.start();

        }

        for(Thread t:vec){
            t.join();
        }


        System.out.println(test.inc);
    }

}
