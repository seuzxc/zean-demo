package com.ebook.chapter03.designpattern.structural.decorator;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class FileDataSource implements DataSource {

    private String data;

    @Override
    public void writeData(String data) {
        System.err.println("write the following data to a file: ");
        System.err.println(data);
        this.data = data;
        System.err.println("the data writing finished");
    }

    @Override
    public String readData() {
        System.err.println("read from a file");

        return data;
    }
}
