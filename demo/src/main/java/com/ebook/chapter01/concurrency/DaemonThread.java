package com.ebook.chapter01.concurrency;

/*****
 * @Author zengxiangcai
 * Created at 2018/5/14
 * @Email zengxiangcai@yishufu.com
 *  daemon thread will terminated immediately if there is no non-daemon thread
 ****/

public class DaemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"daemonRunnerThread");
        thread.setDaemon(true);
        thread.start();
        System.err.println("main thread...");
    }

    static class DaemonRunner implements Runnable {

        @Override
        public void run() {
            try {
                System.err.println("daemonRunner start...");
                ThreadStatus.SleepUtils.second(10);
                System.err.println("test daemon...");
            } finally {
                System.err.println("daemonRunner thread finished...");
            }
        }
    }
}
