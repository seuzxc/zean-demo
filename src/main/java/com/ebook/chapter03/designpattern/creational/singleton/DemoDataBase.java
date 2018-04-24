package com.ebook.chapter03.designpattern.creational.singleton;

/*****
 * @Author zean
 * Created at 2018/4/13
 * @Email zxc200706@hotmail.com
 * 在使用时初始化实例，通过double-checked locking 控制多线程情况下不会出现多个实例
 ****/

public class DemoDataBase {


    private static DemoDataBase demoDataBase;

    private DemoDataBase() {
    }

    public void printName() {
        System.err.println("lazy initialization...");
    }

    public static DemoDataBase getInstance() {
        if (demoDataBase == null) {
            synchronized (DemoDataBase.class) {
                if (demoDataBase == null) {
                    demoDataBase = new DemoDataBase();
                }
            }
        }
        return demoDataBase;
    }


    public static DemoDataBase getInstanceVersion2() {
        if (demoDataBase == null) {
            synchronized (DemoDataBase.class) {
                if (demoDataBase == null) {
                    demoDataBase = new DemoDataBase();
                }
            }
        }
        return demoDataBase;
    }


}
