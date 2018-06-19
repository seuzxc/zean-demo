package com.ebook.chapter03.designpattern.structural.composite;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CompositeTest {

    public static void main(String[] args) {

        /***
         * 组合模式有两点：
         * 1、将对象组成树形结构来表示“局部-整体”的层次结构
         * 2、让客户端调用的时候可以把对象和组合起来的对象同等对待(对外暴露相同的方法)
         */
        CatalogComponent product1 = new Product("product1",12.0);
        CatalogComponent product2 = new Product("product2",11.5);

        CatalogComponent catalog1 = new ProductCatalog("catalog1");
        CatalogComponent  c1p1 = new Product("c1p1",1.1);
        CatalogComponent c1p2 = new Product("c1p2",1.2);
        catalog1.add(c1p1);
        catalog1.add(c1p2);

        CatalogComponent catalog2 = new ProductCatalog("catalog");

        catalog2.add(product1);
        catalog2.add(product2);
        catalog2.add(catalog1);

        catalog2.print();


    }
}
