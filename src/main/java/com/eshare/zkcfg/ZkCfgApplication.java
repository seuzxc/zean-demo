package com.eshare.zkcfg;

import com.eshare.zkcfg.example.ConfigurationCenterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZkCfgApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication
            .run(ZkCfgApplication.class, args);
        ConfigurationCenterService test = applicationContext.getBean(ConfigurationCenterService.class);

        try {

            //print the /com/share/smsCount node data
            String data = test.getDataWithClient("/com/eshare/smsCount");
            System.err.println(data);

            //print the data set with @Value
            System.err.println(test.getDataInitAtApplicationStart());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
