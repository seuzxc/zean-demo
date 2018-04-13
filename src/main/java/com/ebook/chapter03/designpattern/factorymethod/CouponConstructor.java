package com.ebook.chapter03.designpattern.factorymethod;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/12
 * @Email zengxiangcai@yishufu.com
 * 优惠券选择器
 ****/

public interface CouponConstructor {

    Coupon createCoupon();
}
