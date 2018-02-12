package com.bzw.web.backmgmt.mapper;

import com.bzw.web.backmgmt.entity.Signin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Date 2017/11/8      @Author Simba
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SigninMapperTest {

    private static final Logger logger = LoggerFactory.getLogger(SigninMapperTest.class);
    @Autowired
    private SigninMapper mapper;

    @Test
    public void getSignIn() throws Exception {
        Signin result = mapper.getSignByUid(1);
        logger.info("resutl is : {}", result);
        Signin result2 = mapper.getSignByUid(15);
        logger.info("resutl2 is : {}", result2);
    }

    @Test
    public void insert() throws Exception {
        Signin signin = new Signin();
        signin.setUid(115);
        signin.setCountContinuousDays(10);
        signin.setCountTotalDays(100);
        signin.setRecentSignDay(new Date());
        int result = mapper.insert(signin);
        logger.info("resutl is : {}", result);
    }
}