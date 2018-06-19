package com.ebook.chapter03.designpattern.creational.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zean
 * Created at 2018/4/12
 * @Email zxc200706@hotmail.com
 *
 ****/

public class RateCouponConstructor implements CouponConstructor {

    @Override
    public Coupon createCoupon() {
        RateCoupon coupon = new RateCoupon(new BigDecimal("0.01"), new BigDecimal("200"));
        return coupon;
    }
}
