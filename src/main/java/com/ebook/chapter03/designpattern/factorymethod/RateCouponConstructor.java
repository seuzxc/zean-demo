package com.ebook.chapter03.designpattern.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/12
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class RateCouponConstructor implements CouponConstructor {

    @Override
    public Coupon createCoupon() {
        RateCoupon coupon = new RateCoupon(new BigDecimal("0.01"), new BigDecimal("200"));
        return coupon;
    }
}
