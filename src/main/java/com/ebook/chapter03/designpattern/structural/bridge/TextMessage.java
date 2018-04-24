package com.ebook.chapter03.designpattern.structural.bridge;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/


public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send() {
         messageSender.send();
    }
}
