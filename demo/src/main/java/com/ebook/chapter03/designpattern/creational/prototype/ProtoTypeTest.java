package com.ebook.chapter03.designpattern.creational.prototype;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ProtoTypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle c1 = new Circle();
        c1.setX(1);
        c1.setY(2);
        c1.setColor("red");
        c1.setRadius(1.2f);

        System.err.println("the prototype: " + c1);

        Circle circleClone = (Circle) c1.clone();

        System.err.println("cloned object: " + circleClone);
    }
}
