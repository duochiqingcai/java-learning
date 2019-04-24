package com.dcqc.demo;

import com.dcqc.demo.学习笔记.进阶.mybatis.service.impl.ActorServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterviewApplicationTests {
    private final static Logger LOGGER = LoggerFactory.getLogger(InterviewApplicationTests.class);

    @Autowired
    private ActorServiceImpl actorService;

    @Test
    public void contextLoads() {
        
        actorService.insertActor();
        LOGGER.info("actor", actorService.queryActorByName("NICK", "WAHLBERG").getLastUpdate());
    }

}
