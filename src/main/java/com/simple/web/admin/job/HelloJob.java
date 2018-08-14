package com.simple.web.admin.job;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Date 2018/4/26      @Author Simba
 * @Description:
 */
@Component
public class HelloJob {

    private static final Logger logger = LoggerFactory.getLogger(HelloJob.class);


    @Value("${hello.world}")
    private String hello;

    @Scheduled(cron = "${hello.cron}")
    public void sayHello() throws InterruptedException {
        logger.info(hello + "1:" + new Date());
        Thread.sleep(6000);
        logger.info(hello + "2:" + new Date());
    }
}
