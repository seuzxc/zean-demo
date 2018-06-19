package com.ebook.chapter01.concurrency;

import java.util.concurrent.TimeUnit;


/*****
 * @Author zengxiangcai
 * Created at 2018/5/14
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class ThreadStatus {

    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "timeWaitingThread").start();
        new Thread(new Waiting(), "waitingThread").start();
        new Thread(new Blocked(),"blockedThread-1").start();
        new Thread(new Blocked(),"blockedThread-2").start();
    }

    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(100);
            }
        }
    }

    static class Waiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {

        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    SleepUtils.second(100);
                }
            }
        }
    }


    static class SleepUtils {

        public static void second(long seconds) {
            try {
                TimeUnit.SECONDS.sleep(seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
