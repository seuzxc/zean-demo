package com.ebook.chapter03.designpattern.structural.facade;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/19
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class PaymentService {
    public boolean payOrder(Order order){
        //connect to the third party to pay for the order
        return true;
    }
}
