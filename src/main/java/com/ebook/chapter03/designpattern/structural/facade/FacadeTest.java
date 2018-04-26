package com.ebook.chapter03.designpattern.structural.facade;

/*****
 * @Author zean
 * Created at 2018/4/19
 * @Email zxc200706@hotmail.com
 *
 ****/

public class FacadeTest {

    public static void main(String[] args) {
        /****
         * 将复杂的逻辑隐藏起来，对外值提供简单的接口
         */
        OrderFacade facade = new OrderFacadeImpl();
        Order order = new Order("XXXXX2018***","order",1);
        facade.placeOrder(order);
    }
}
