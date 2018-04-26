package com.simple.web.admin.mapper;

import com.simple.web.admin.entity.Jfuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Date 2017/11/10      @Author Simba
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JfuserMapperTest {

    private static final Logger logger = LoggerFactory.getLogger(JfuserMapperTest.class);
    @Autowired
    private JfuserMapper mapper;

    @Test
    public void insert() throws Exception {
        for (int i = 1, j = 50; i <= j; i++) {
            ConcurrentHashMap map;
            Jfuser jfuser = new Jfuser();
            jfuser.setUid(i);
            jfuser.setName("hello" + i);
            int result = mapper.insert(jfuser);
            logger.info("resutl is : {}", result);
        }
    }
}