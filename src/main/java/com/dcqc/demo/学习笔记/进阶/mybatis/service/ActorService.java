package com.dcqc.demo.学习笔记.进阶.mybatis.service;

import com.dcqc.demo.学习笔记.进阶.mybatis.entity.DO.Actor;
import org.springframework.stereotype.Service;

@Service
public interface ActorService {

    Actor queryActorByName(Actor actor);

    void saveActor(Actor actor);
}
