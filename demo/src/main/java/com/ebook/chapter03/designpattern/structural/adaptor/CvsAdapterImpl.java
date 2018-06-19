package com.ebook.chapter03.designpattern.structural.adaptor;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class CvsAdapterImpl implements TextFormattable {

    private CvsFormattable cvsFormatter;

    public CvsAdapterImpl(CvsFormattable cvsFormatter){
        this.cvsFormatter = cvsFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText = cvsFormatter.formatCvsText(text);
        return formattedText;
    }
}
