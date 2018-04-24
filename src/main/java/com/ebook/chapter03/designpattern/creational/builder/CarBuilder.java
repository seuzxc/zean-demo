package com.ebook.chapter03.designpattern.creational.builder;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats() {
        System.err.println("assemble the car seats");
    }

    @Override
    public void setEngine() {
        System.err.println("assemble the car engine");
    }

    @Override
    public void setTripComputer() {
        System.err.println("assemble the trip computer");
    }

    @Override
    public void setGPS() {
        System.err.println("assemble the gps");
    }

    public Car getResult() {
        return car;
    }
}
