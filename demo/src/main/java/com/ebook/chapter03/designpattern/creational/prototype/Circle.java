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
public class Circle extends Shape {

    private float radius;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Circle c = (Circle) super.clone();
        c.setColor("test color in Circle of clone");
        return c;
    }

    @Override
    public String toString() {
        return "Circle(x=" + this.getX() + ",y=" + this.getY() + ",color=" + this.getColor()
            + ",radius=" + this.getRadius();
    }
}
