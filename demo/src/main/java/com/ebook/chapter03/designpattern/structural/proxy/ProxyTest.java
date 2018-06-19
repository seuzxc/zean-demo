package com.ebook.chapter03.designpattern.structural.proxy;

/*****
 * @Author zean
 * Created at 2018/4/20
 * @Email zxc200706@hotmail.com
 *
 ****/

public class ProxyTest {

    public static void main(String[] args) {
        /***
         * 代理模式通过实现和被代理的类相同的接口，给客户端提供一致的接口，
         * 但是在代理类内部可以做一些额外的事情，当然也会调用被代理类的接口
         */
        ReportGenerator proxy = new ReportGeneratorImplProxy("Manager");
        proxy.displayReportTemplate("Pdf", 150);
        proxy.generateComplexReport("Pdf", 150);
        proxy.generateSensitiveReport();
    }
}
