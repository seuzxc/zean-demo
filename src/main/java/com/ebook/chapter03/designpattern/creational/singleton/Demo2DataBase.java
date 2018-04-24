package com.ebook.chapter03.designpattern.creational.singleton;

/*****
 * @Author zean
 * Created at 2018/4/13
 * @Email zxc200706@hotmail.com
 *
 ****/

public class Demo2DataBase {

    private static final Demo2DataBase instance = new Demo2DataBase();

    public void printName(){
        System.err.println("eager initialization...");
    }

    public static Demo2DataBase getInstance(){
        return instance;
    }

}
