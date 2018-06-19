package com.ebook.chapter03.designpattern.creational.abstractfactory;

/*****
 * @Author zean
 * Created at 2018/4/16
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ClientTest {

    public static void main(String[] args) {
        String envArg = getEnvironmentArg();
        GUIFactory factory = null;
        if("win".equals(envArg)){
            factory = new WinFactory();
        }else {
            factory = new MacFactory();
        }
        Client client = new Client(factory);
        client.createButton();
        client.paint();
    }

    private static String getEnvironmentArg(){
        return "win";
    }
}
