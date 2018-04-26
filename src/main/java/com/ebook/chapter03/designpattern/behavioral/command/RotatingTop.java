package com.ebook.chapter03.designpattern.behavioral.command;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/25
 * @Email zengxiangcai@yishufu.com
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
