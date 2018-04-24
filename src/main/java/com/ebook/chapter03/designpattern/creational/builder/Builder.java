package com.ebook.chapter03.designpattern.creational.builder;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

public interface Builder {
    void reset();
    void setSeats();
    void setEngine();
    void setTripComputer();
    void setGPS();
}
