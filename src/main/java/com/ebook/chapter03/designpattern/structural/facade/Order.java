package com.ebook.chapter03.designpattern.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*****
 * @Author zean
 * Created at 2018/4/19
 * @Email zxc200706@hotmail.com
 *
 ****/

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String orderId;
    private String desc;
    private int productId;
}
