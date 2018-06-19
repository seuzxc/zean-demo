package com.ebook.chapter03.designpattern.structural.decorator;

/*****
 * @Author zean
 * Created at 2018/4/18
 * @Email zxc200706@hotmail.com
 *
 ****/

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data){
        String encryptedData = "encrypted:"+data;
        super.writeData(encryptedData);
    }

    @Override
    public String readData(){
        return super.readData().replace("encryped:","");
    }
}
