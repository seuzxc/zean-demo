package com.ebook.chapter03.designpattern.creational.singleton;

/*****
 * @Author zean
 * Created at 2018/4/13
 * @Email zxc200706@hotmail.com
 * 在使用时初始化实例，通过double-checked locking 控制多线程情况下不会出现多个实例
 * 和 @link(DemoDataBase) 相比只是将demoDataBase改为volatile类型的变量
 * 因为JLS规定编译器生成的代码可以将共享变量纸箱还未完全构造好的对象（partially constructed object），
 * 比如对象只分配了内存空间，还没有对属性赋值，这个时候其他现在可以见到对象非空，
 * 如果直接使用的话可能会出现对象的属性值为空，没有初始化好，进而造成一些列其他的错误
 * volatile 变量可以保证：
 * 1) 线程间的可见性：如果线程A改变了volatile变量，线程B能够立刻读取到线程A最新的值
 * 2) 禁止指令重新排列
 * 【根据happen-before 规则 volatile变量规则：对一个变量的写操作先行发生于后面对这个变量的读操作】
 ****/

public class Demo4DataBase {


    private static volatile Demo4DataBase demoDataBase;

    private Demo4DataBase() {
    }

    public void printName() {
        System.err.println("lazy initialization...");
    }

    public static Demo4DataBase getInstance() {
        if (demoDataBase == null) {
            synchronized (DemoDataBase.class) {
                if (demoDataBase == null) {
                    demoDataBase = new Demo4DataBase();
                }
            }
        }
        return demoDataBase;
    }



}
