package com.ebook.chapter03.designpattern.creational.builder;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.buidCar(carBuilder);

        Car car = carBuilder.getResult();

        CarManualBuilder builder = new CarManualBuilder();
        director.buidCar(builder);

        CarManual carManual = builder.getResult();
    }
}
