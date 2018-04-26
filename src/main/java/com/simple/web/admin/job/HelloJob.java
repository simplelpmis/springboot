package com.simple.web.admin.job;


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
    @Value("${hello.world}")
    private String hello;

    @Scheduled(cron = "${hello.cron}")
    public void sayHello() {
        System.out.println(hello + ":" + new Date());
    }
}
