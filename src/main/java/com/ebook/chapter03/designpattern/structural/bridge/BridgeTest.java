package com.ebook.chapter03.designpattern.structural.bridge;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class BridgeTest {

    public static void main(String[] args) {

        /****
         * bridge pattern 通过将底层的实现抽离出来，解耦和上层抽象的关联，通过组合的方式将底层实现和抽象结合(has a)
         * 这样一来底层实现和上层的抽象可以独立发展变化
         */
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender mailSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(mailSender);
        emailMessage.send();

    }
}
