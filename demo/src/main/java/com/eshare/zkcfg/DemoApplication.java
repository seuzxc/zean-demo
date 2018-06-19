package com.eshare.zkcfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ebook")
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication
            .run(DemoApplication.class, args);
//        ConfigurationCenterService test = applicationContext.getBean(ConfigurationCenterService.class);
//
//        try {
//
//            //print the /com/share/smsCount node data
//            String data = test.getDataWithClient("/com/eshare/smsCount");
//            System.err.println(data);
//
//            //print the data set with @Value
//            System.err.println(test.getDataInitAtApplicationStart());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
