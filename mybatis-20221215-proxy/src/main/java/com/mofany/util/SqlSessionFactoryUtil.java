package com.mofany.util;

import lombok.Synchronized;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description SqlSessionFactoryUtil
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory=null;

    /**
     * 禁止反射
     * */
    private SqlSessionFactoryUtil(){
        throw new RuntimeException("禁止反射！");
    }

    /**
     * 初始化工厂
     * */
    public static SqlSessionFactory initSqlSessionFactory() {
        //加载主配置文件
        InputStream dataSource= null;
        try {
            dataSource = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //保持同步(最好使用单例双检查机制)
        synchronized (SqlSessionFactoryUtil.class){
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(dataSource);
        }
        return sqlSessionFactory;
    }

    /**
     * 获取SQL会话对象
     * */
    public static SqlSession getSqlSession() {
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
