package com.ebook.chapter03.designpattern.creational.factorymethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*****
 * @Author zean
 * Created at 2018/4/12
 * @Email zxc200706@hotmail.com
 *
 ****/

public class Test {

    public static void main(String[] args) throws Exception {
        File f = new File("C:\\factorymethod");
        replaceChineseToEmpty(f);

    }

    /***
     * 将文件中中文以空替换
     * @param f
     */
    public static void replaceChineseToEmpty(File f) throws Exception {

        //目录
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                replaceChineseToEmpty(file);
            }
            return;
        }

        System.err.println(f.getAbsolutePath());
        //文件
        BufferedReader reader = new BufferedReader(new FileReader(f));
        StringBuffer resultData = new StringBuffer();
        String str = null;
        while ((str = reader.readLine()) != null) {
            String strPattern = "([\u4e00-\u9fa5])";
            Pattern pattern = Pattern.compile(strPattern);

            Matcher m = pattern.matcher(str);
            String lineResult = str;
            if (m.find()) {
                lineResult = m.replaceAll("");
            }
            resultData.append(lineResult);
            resultData.append("\r\n");
        }
        reader.close();

        //写入文件

        BufferedWriter writer = new BufferedWriter(new FileWriter(f));
        writer.write(resultData.toString());
        writer.close();
    }
}
