package com.dcqc.demo.学习笔记.进阶.mybatis.service.impl;

import com.dcqc.demo.学习笔记.进阶.mybatis.dao.ActorDao;
import com.dcqc.demo.学习笔记.进阶.mybatis.entity.DO.Actor;
import com.dcqc.demo.学习笔记.进阶.mybatis.service.ActorService;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {
    //@Autowired private ActorDao actorDao 不要使用属性注入，会发生NullPointerException，因为启动依赖容器时，类可能未运转；可以使用构造器注入或者set方法注入
    private final ActorDao actorDao;

    public ActorServiceImpl(ActorDao actorDao) {
        this.actorDao = actorDao;
        //this.actor = actor;
    }

    @Override
    public Actor queryActorByName(Actor actor) {

        return actorDao.selectByActor(actor);
    }

    @Override
    public void saveActor(Actor actor) {
        actorDao.insertActor(actor);
    }


}
