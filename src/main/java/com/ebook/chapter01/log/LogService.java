package com.ebook.chapter01.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;

/*****
 * @Author zean
 * Created at 2018/4/8
 * @Email @Email zxc200706@hotmail.com
 *
 ****/


public class LogService {

    private static final Logger logger = LogManager.getLogger(LogService.class);

    public static void main(String[] args) {
        MDC.put("key","test-mdc-key");
        logger.trace("the main thread start");

        try {
            int i = 1/0;
            System.err.println(i);
        } catch (Exception e) {
            logger.error("error find", e);
        }

        logger.info("the main thread end.11111");
        MDC.remove("key");
    }
}
