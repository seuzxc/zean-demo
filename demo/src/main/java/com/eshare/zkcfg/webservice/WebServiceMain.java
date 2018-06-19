package com.eshare.zkcfg.webservice;

import javax.xml.ws.Endpoint;

/*****
 * @Author zengxiangcai
 * Created at 2018/6/13
 * @Email zengxiangcai@yishufu.com
 *
 ****/

public class WebServiceMain {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/BillPaymentWS/BillPaymentService",new BillPaymentWsImpl());

        System.err.println("finished....");
    }
}
