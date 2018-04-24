package com.ebook.chapter03.designpattern.creational.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zean
 * Created at 2018/4/12
 * @Email zxc200706@hotmail.com
 *
 ****/

public class AmountCouponConstructor implements CouponConstructor {

    @Override
    public Coupon createCoupon() {
        AmountCoupon coupon = new AmountCoupon(new BigDecimal("150"));
        return coupon;
    }
}
