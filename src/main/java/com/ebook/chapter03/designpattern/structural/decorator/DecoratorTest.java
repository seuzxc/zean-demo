package com.ebook.chapter03.designpattern.structural.decorator;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class DecoratorTest {

    public static void main(String[] args) {
        DataSource source = new FileDataSource();
        source.writeData(" file data test");
        System.err.println(source.readData());


        DataSource source1 = new EncryptionDecorator(source);
        source1.writeData("encrypted decorator data");
        System.err.println(source1.readData());

        DataSource source2 = new CompressionDecorator(source);

        source2.writeData("compressed decorator data");
        System.err.println(source2.readData());

    }

}
