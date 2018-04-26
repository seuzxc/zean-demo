package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zean
 * Created at 2018/4/25
 * @Email zxc200706@hotmail.com
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
