package com.ebook.chapter03.designpattern.structural.composite;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class Product extends CatalogComponent {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.err.println("Product name:" + name + ",price:" + price);
    }
}
