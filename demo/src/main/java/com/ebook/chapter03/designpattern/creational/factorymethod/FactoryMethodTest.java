package com.ebook.chapter03.designpattern.creational.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zean
 * Created at 2018/4/12
 * @Email zxc200706@hotmail.com
 *
 ****/

public class FactoryMethodTest {

    public static void main(String[] args) {
        CouponConstructor constructor;
        String activityType = "deduct";
        if("deduct".equals(activityType)){
            constructor = new RateCouponConstructor();
        }else{
            constructor = new AmountCouponConstructor();
        }
        BigDecimal amount = constructor.createCoupon().getDeductAmount();
        System.err.println("the deduct amount is : "+amount);
    }
}
