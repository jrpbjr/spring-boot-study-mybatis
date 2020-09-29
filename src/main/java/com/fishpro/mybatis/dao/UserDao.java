package com.fishpro.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fishpro.mybatis.domain.UserDO;

@Mapper
public interface UserDao {
    /**
           * Corresponding node select id="get" resultType="com.fishpro.mybatis.domain.UserDO"
     * */
    UserDO get(Integer id);
    /**
           * Corresponding node select id="list" resultType="com.fishpro.mybatis.domain.UserDO"
     * */
    List<UserDO> list(Map<String, Object> map);
    /**
           * Corresponding node select id="count" resultType="int"
     * */
    int count(Map<String, Object> map);
    /**
           * Corresponding node insert id="save" parameterType="com.fishpro.mybatis.domain.UserDO" useGeneratedKeys="true" keyProperty="id"
     * */
    int save(UserDO user);
    /**
           * Corresponding node update id="update" parameterType="com.fishpro.mybatis.domain.UserDO"
     * */
    int update(UserDO user);
    /**
           * Corresponding node delete id="remove"
     * */
    int remove(Integer id);
    /**
           * Corresponding node delete id="batchRemove"
     * */
    int batchRemove(Integer[] ids);
}