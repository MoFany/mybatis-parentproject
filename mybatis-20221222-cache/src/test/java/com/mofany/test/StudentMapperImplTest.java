package com.mofany.test;

import com.mofany.entity.Student;
import com.mofany.mapper.StudentMapper;
import com.mofany.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description StudentMapperImplTest
 */
public class StudentMapperImplTest {
    private Student student=new Student();
    /**
     * 获取接口的代理对象
     * 代理对象.方法(参数列表)===>proxy.method(args)
     * */
    private StudentMapper studentMapperProxy= SqlSessionFactoryUtil.createSqlSession().getMapper(StudentMapper.class);

    /**
     * 不同SqlSession的同种访问使用二级缓存
     * */
    @Test
    public void test1(){
        student.setId(666);

        //第一次查询，数据库
        SqlSession sqlSession1=SqlSessionFactoryUtil.createSqlSession();
        System.out.println(sqlSession1.getMapper(StudentMapper.class).queryById(student));
        sqlSession1.close();

        //第二次查询，二级缓存，缓存命中率0.5
        SqlSession sqlSession2=SqlSessionFactoryUtil.createSqlSession();
        System.out.println(sqlSession2.getMapper(StudentMapper.class).queryById(student));
        sqlSession2.close();

        //第二次查询，二级缓存，缓存命中率0.6
        SqlSession sqlSession3=SqlSessionFactoryUtil.createSqlSession();
        System.out.println(sqlSession3.getMapper(StudentMapper.class).queryById(student));
        sqlSession3.close();
    }

    /**
     * 同一个SqlSession的同种重复访问默认使用一级缓存
     * */
    @Test
    public void test2(){
        student.setId(888);
        //代理对象.方法(参数列表)===>proxy.method(args)
        var obj1=studentMapperProxy.queryById(student);
        System.out.println(obj1);
        var obj2=studentMapperProxy.queryById(student);
        System.out.println(obj2);
        System.out.println("是否使用了一级缓存："+(obj1==obj2));
    }
}
