package com.ebook.chapter03.designpattern.structural.adaptor;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class NewLineFormatter implements TextFormattable {

    @Override
    public String formatText(String text) {
        String formattedText = text.replace("#","\n");
        return formattedText;
    }
}
