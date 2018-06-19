package com.ebook.chapter03.designpattern.structural.adaptor;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CvsFormatter implements CvsFormattable {

    @Override
    public String formatCvsText(String text) {
        String result = text.replace("#",",");
        return result;
    }
}
