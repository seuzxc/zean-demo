package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/24
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public interface SupportHandler {
    int TECHNICAL = 10;
    int BILLING = 20;
    int GENERAL = 30;

    void receiveRequest(int level, String message);
}
