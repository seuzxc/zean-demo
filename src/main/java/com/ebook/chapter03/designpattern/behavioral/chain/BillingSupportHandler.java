package com.ebook.chapter03.designpattern.behavioral.chain;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/24
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class BillingSupportHandler extends AbstractSupportHandler {

    public BillingSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.err.println("billing support handler: process message " + message);
    }
}
