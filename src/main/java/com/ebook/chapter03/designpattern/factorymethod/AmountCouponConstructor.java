package com.ebook.chapter03.designpattern.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/12
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class AmountCouponConstructor implements CouponConstructor {

    @Override
    public Coupon createCoupon() {
        AmountCoupon coupon = new AmountCoupon(new BigDecimal("150"));
        return coupon;
    }
}
