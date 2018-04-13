package com.ebook.chapter03.designpattern.singleton;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/13
 * @Email zengxiangcai@yishufu.com
 * JVM 中线程安全的单例模式
 * 说明：根据java语言规范(JSL)，Demo3DataBase类加载进入jvm后，会进行初始化，由于这个类没有static变量，所以很快就初始化完成。
 * 而LazyHolder只有在JVM准备执行它的时候才会进行初始化。在LazyHolder加载初始化的时候会导致static变量INSTANCE进行初始化。
 * 根据JSL约定类的初始化阶段是串行化的，所以INSTANCE初始化赋值都是串行进行的。
 * reference：https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 ****/

public class Demo3DataBase {
    private Demo3DataBase(){}

    public void printName(){
        System.err.println("initialization with private static class");
    }

    private static class LazyHolder{
        static final Demo3DataBase INSTANCE = new Demo3DataBase();
    }

    public static Demo3DataBase getInstance(){
        return LazyHolder.INSTANCE;
    }
}
