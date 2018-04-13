package com.ebook.chapter03.designpattern.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/12
 * @Email zengxiangcai@yishufu.com
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
