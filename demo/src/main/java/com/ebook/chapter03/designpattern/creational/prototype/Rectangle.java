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
public class Rectangle extends Shape {

    private int width;
    private int height;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle(x=" + this.getColor() + ",y=" + this.getY() + ",color=" + this.getColor()
            + ",width=" + this.getWidth() + ",height=" + this.getHeight();
    }
}
