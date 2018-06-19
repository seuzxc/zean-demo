package com.ebook.chapter03.designpattern.structural.decorator;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public interface DataSource {
    void writeData(String data);
    String readData();
}
