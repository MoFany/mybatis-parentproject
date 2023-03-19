package com.mofany.util;

import lombok.Synchronized;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description SqlSessionFactoryUtil
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory=null;

    private SqlSessionFactoryUtil(){
        throw new RuntimeException("禁止反射！");
    }

    /**
     * 初始化工厂
     * */
    protected static synchronized void initSqlSessionFactory(){
        InputStream dataSource=null;
        try {
            dataSource= Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(dataSource);
    }

    /**
     * 单例双检查机制
     * */
    public static SqlSession createSqlSession(){
        if (sqlSessionFactory==null){
            synchronized (SqlSessionFactoryUtil.class){
                if (sqlSessionFactory==null){
                    //初始化工厂
                    initSqlSessionFactory();
                }
            }
        }
        return sqlSessionFactory.openSession();
    }
}
