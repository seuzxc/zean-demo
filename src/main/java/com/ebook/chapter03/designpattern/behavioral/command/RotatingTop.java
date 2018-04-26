package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zean
 * Created at 2018/4/25
 * @Email zxc200706@hotmail.com
 *
 ****/
//command receiver
public class RotatingTop {
    public void startRotating(){
        System.err.println("top has start rotating");
    }

    public void stopRotating(){
        System.err.println("top has stopped rotating");
    }
}
