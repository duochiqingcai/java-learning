package com.dcqc.demo.学习笔记.进阶.mybatis.dao;

import com.dcqc.demo.学习笔记.进阶.mybatis.entity.DO.Actor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ActorDao {
    //直接对标数据库，方法名称应该贴近sql的写法，清晰表达
    @Select("select * from sakila.actor where first_name=#{actor.firstName} and last_name=#{actor.lastName}")
    Actor selectByActor(@Param("actor") Actor actor);

    @Update("")
    void updateActor(@Param("actor") Actor actor);

    @Insert("insert into actor(first_name,last_name,last_update) values (#{actor.firstName,actor.lastName,actor.lastUpdate})")
    void insertActor(@Param("actor") Actor actor);

}
