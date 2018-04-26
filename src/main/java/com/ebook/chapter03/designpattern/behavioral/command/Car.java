package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/25
 * @Email zengxiangcai@yishufu.com
 *
 ****/
//command receiver
public class Car {
    public void move(){
        System.err.println("Car is moving");
    }
    public void stop(){
        System.err.println("Car has stopped");
    }
}
