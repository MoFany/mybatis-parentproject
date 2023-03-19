package com.mofany.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description SqlSessionFactoryUtil 单例懒汉式
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //加载数据源文件
            InputStream dataSource= Resources.getResourceAsStream("mybatis-config.xml");
            //创建SQL会话工厂对象
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(dataSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SqlSessionFactoryUtil(){
        throw new RuntimeException("静止反射工具类");
    }

    /**
     * 返回一个SQL会话对象
     * */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
