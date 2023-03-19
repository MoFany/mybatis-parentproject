package com.mofany.util;

import lombok.Cleanup;
import lombok.NoArgsConstructor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description SqlSessionFactoryUtil 静态单例懒汉模式
 */
public class SqlSessionFactoryUtil {
    /**
     * 类变量
     * */
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 静态语句块用于初始化类变量
     * */
    static {
        try {
            //加载数据源映射的配置文件
            @Cleanup
            InputStream dataSource= Resources.getResourceAsStream("mybatis-config.xml");
            //构建器模式创建一个SQL会话工厂对象
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(dataSource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 私有构造器
     * */
    public SqlSessionFactoryUtil(){
        throw new RuntimeException("静止反射工具类");
    }

    /**
     * 通过SQL会话工厂对象返回一个SQL会话对象
     * */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
