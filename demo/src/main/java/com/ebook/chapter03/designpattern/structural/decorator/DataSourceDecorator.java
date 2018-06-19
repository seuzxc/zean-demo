package com.ebook.chapter03.designpattern.structural.decorator;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;//被包装对象

    public DataSourceDecorator(DataSource source){
        this.wrappee = source;
    }


    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
