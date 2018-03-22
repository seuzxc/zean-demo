package com.eshare.zkcfg;

import com.eshare.zkcfg.config.CfgTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZkCfgApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication
            .run(ZkCfgApplication.class, args);
        CfgTest test = applicationContext.getBean(CfgTest.class);

        try {

            //print the /com/share/smsCount node data
            String data = test.getDataWithClient("/com/eshare/smsCount");
            System.err.println(data);

            //print the data set with @Value
            test.printPropertyValueWithAnnotation();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
