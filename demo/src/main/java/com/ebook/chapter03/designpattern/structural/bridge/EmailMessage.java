package com.ebook.chapter03.designpattern.structural.bridge;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.send();
    }
}
