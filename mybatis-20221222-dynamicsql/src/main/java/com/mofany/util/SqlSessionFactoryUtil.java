package com.mofany.util;

import com.mysql.cj.result.SqlDateValueFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description SqlSessionFactoryUtil
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory=null;

    private SqlSessionFactoryUtil(){
        throw new RuntimeException("禁止反射");
    }

    /**
     * 初始化工厂
     * */
    protected static synchronized void initSqlSessionFactory(){
        try {
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用工厂创建对象
     * */
    public static SqlSession createSqlSession(){
        //单例双检查机制
        if (sqlSessionFactory==null){
            synchronized (SqlSessionFactoryUtil.class){
                if (sqlSessionFactory==null){
                    initSqlSessionFactory();
                }
            }
        }
        return sqlSessionFactory.openSession();
    }
}
