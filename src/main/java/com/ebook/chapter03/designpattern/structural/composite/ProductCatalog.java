package com.ebook.chapter03.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ProductCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    public ProductCatalog(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void print(){
        for(CatalogComponent component: items){
            component.print();
        }
    }

    public void add(CatalogComponent component){
        items.add(component);
    }

    public void remove(CatalogComponent component){
        items.remove(component);
    }
}
