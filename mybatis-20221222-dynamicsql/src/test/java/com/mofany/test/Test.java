package com.mofany.test;

import com.mofany.mapper.RelationMapper;
import com.mofany.mapper.RoleMapper;
import com.mofany.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description Test
 */
public class Test {
    private SqlSession sqlSession= SqlSessionFactoryUtil.createSqlSession();

    /**
     * 三表联合查询：一对多
     * */
    @org.junit.Test
    public void test1(){
        RelationMapper relationMapper=sqlSession.getMapper(RelationMapper.class);
        relationMapper.queryAll().stream().forEach(System.out::println);
    }

    /**
     * 三表联合查询：多对多
     * */
    @org.junit.Test
    public void test2(){
        RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);
        roleMapper.queryAll().stream().forEach(System.out::println);
    }
}
