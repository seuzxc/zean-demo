package com.ebook.chapter01.log;

import java.net.URLDecoder;

/*****
 * @Author zean
 * Created at 2018/4/26
 * @Email zxc200706@hotmail.com
 *
 ****/

public class Test {

    void spin() {
        int i, b;
        for (i = 0, b = 2; i < 100; i++) {
            ;
        }
    }

    public static void main(String[] args) throws Exception{
        float a = 11111111111111111111111111111111.01212f;
        float b = 22.1111111111111111111111111111111111111111f;
        System.err.println(a / b);
        System.err.println("this is a test for java compiler");

        Test t1 = new Test();
        t1.printStr();

        System.err.println(URLDecoder.decode("%E5%A4%8F%E5%B0%8F%E6%85%A7","UTF-8"));
    }


    public void printStr() {
        System.err.println(concatStr("string1", "string2"));
    }

    private String concatStr(String s1, String s2) {
        if (s1 == null) {
            s1 = "";
        }
        if (s2 == null) {
            s2 = "";
        }
        return s1 + "|" + s2;
    }
}
