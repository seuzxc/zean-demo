package com.ebook.chapter03.designpattern.creational.factorymethod;

import java.math.BigDecimal;

/*****
 * @Author zean
 * Created at 2018/4/12
 * @Email zxc200706@hotmail.com
 * 优惠券
 ****/

public interface Coupon {
    BigDecimal getDeductAmount(); //抵扣金额
}
