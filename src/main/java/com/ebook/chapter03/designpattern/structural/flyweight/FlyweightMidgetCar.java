package com.ebook.chapter03.designpattern.structural.flyweight;

/*****
 * @Author zean
 * Created at 2018/4/19
 * @Email zxc200706@hotmail.com
 *
 ****/

public class FlyweightMidgetCar extends RaceCar {

    public static int num;
    public FlyweightMidgetCar(String name, int speed, int horsePower) {
        this.setName(name);
        this.setSpeed(speed);
        this.setHorsePower(horsePower);
        num++;
    }

    @Override
    void moveCar(int currentX, int currentY, int nextX, int nextY) {
        System.err
            .println("new location of " + this.getName() + "is X: " + nextX + ", Y: " + nextY);
    }
}
