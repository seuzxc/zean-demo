package com.ebook.chapter03.designpattern.factorymethod;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 中文测试
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AmountCoupon implements Coupon {

    private BigDecimal amount = new BigDecimal("100");

    @Override
    public BigDecimal getDeductAmount() {
        return amount;
    }
}
