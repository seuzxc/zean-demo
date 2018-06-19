package com.ebook.chapter03.designpattern.creational.abstractfactory;

import lombok.Getter;
import lombok.Setter;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

@Getter
@Setter
public class Client {

    private Button button;
    private GUIFactory factory;

    public Client(GUIFactory factory) {
        this.factory = factory;
    }
    public void createButton(){
        this.button = factory.createButton();
    }

    public void paint(){
        button.paint();
    }
}
