package com.ebook.chapter03.designpattern.structural.flyweight;

/*****
 * @Author zengxiangcai
 * Created at 2018/4/20
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class RaceCarClient {

    private RaceCar raceCar;

    public RaceCarClient(String name) {
        raceCar = CarFactory.getRaceCar(name);
    }

    private int currentX = 0;
    private int currentY = 0;

    public void moveCar(int newX, int newY) {
        raceCar.moveCar(currentX, currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}
