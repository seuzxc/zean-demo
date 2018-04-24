package com.ebook.chapter03.designpattern.structural.bridge;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class EmailMessageSender implements MessageSender {

    @Override
    public void send() {
        System.err.println("send email");
    }
}
