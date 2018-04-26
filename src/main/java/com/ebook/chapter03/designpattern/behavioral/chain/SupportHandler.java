package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zean
 * Created at 2018/4/24
 * @Email zxc200706@hotmail.com
 *
 ****/

public interface SupportHandler {
    int TECHNICAL = 10;
    int BILLING = 20;
    int GENERAL = 30;

    void receiveRequest(int level, String message);
}
