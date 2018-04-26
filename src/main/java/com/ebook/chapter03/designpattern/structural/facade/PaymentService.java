package com.ebook.chapter03.designpattern.structural.facade;

/*****
 * @Author zean
 * Created at 2018/4/19
 * @Email zxc200706@hotmail.com
 *
 ****/

public class PaymentService {
    public boolean payOrder(Order order){
        //connect to the third party to pay for the order
        return true;
    }
}
