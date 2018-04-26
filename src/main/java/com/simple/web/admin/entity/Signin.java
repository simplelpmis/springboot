package com.simple.web.admin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Date 2017/11/8      @Author Simba
 * @Description:
 */
@Data
public class Signin {
    private int id;
    private int uid;
    private Date recentSignDay;
    private int countContinuousDays;
    private int countTotalDays;
}