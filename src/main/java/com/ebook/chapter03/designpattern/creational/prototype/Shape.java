package com.ebook.chapter03.designpattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

@Getter
@Setter
public class Shape implements Cloneable{
    private int x;
    private int y;
    private String color;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
