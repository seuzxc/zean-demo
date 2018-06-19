package com.ebook.chapter03.designpattern.structural.adaptor;

/*****
 * @Author zean
 * Created at 2018/4/17
 * @Email zxc200706@hotmail.com
 *
 ****/

public class AdapterTest {

    public static void main(String[] args) {

        /***
         * 已有服务TextFormattable,客户端调用其formatText方法处理逻辑
         *
         * 增加了一个新的特性CvsFormattable，在不改变已有的接口调用的方式下，需要调用新特性。
         *
         * 需要中间增加一个adapter CvsAdapterImpl 适配(实现已有的接口，时间调用逻辑是使用新的接口)
         */

        String text = "formatting line 1#formatting line 2#formatting line 3";
        TextFormattable newLineFormatter = new NewLineFormatter();

        String result = newLineFormatter.formatText(text);
        System.out.println(result);

        CvsFormattable cvsFormattable = new CvsFormatter();
        TextFormattable cvsAdapter = new CvsAdapterImpl(cvsFormattable);

        String result2 = cvsAdapter.formatText(text);
        System.out.println(result2);
    }


}
