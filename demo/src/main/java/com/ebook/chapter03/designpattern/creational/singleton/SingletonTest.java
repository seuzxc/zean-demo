package com.ebook.chapter03.designpattern.creational.singleton;

/*****
 * @Author zean
 * Created at 2018/4/13
 * @Email zxc200706@hotmail.com
 *
 ****/

public class SingletonTest {

    public static void main(String[] args) {
        DemoDataBase d1 = DemoDataBase.getInstance();
        Demo2DataBase d2 = Demo2DataBase.getInstance();
        Demo3DataBase d3 = Demo3DataBase.getInstance();
        d1.printName();
        d2.printName();
        d3.printName();
    }
}
