package com.ebook.chapter03.designpattern.creational.builder;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CarManualBuilder implements Builder {

    private CarManual carManual;

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats() {
        System.err.println("set seats description");
    }

    @Override
    public void setEngine() {
        System.err.println("introduction to engine");
    }

    @Override
    public void setTripComputer() {
        System.err.println("introduction to trip computer");
    }

    @Override
    public void setGPS() {
        System.err.println("introduction to set gps");
    }

    public CarManual getResult(){
        return carManual;
    }
}
