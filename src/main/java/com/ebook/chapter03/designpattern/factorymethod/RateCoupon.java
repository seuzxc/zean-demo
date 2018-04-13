package com.ebook.chapter03.designpattern.factorymethod;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/12
 * @Email zengxiangcai@yishufu.com
 * 按比例折扣优惠券
 ****/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RateCoupon implements Coupon {

    private BigDecimal rate = new BigDecimal("0.01");

    private BigDecimal baseAmount = new BigDecimal("100");

    @Override
    public BigDecimal getDeductAmount() {
        return baseAmount.multiply(rate);
    }
}
