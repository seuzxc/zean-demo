package com.ebook.chapter03.designpattern.structural.bridge;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public abstract class Message {
   MessageSender messageSender;

   public Message(MessageSender messageSender){
       this.messageSender= messageSender;
   }
   public abstract void send();
}
