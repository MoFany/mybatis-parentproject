package com.mofany.test;

import com.mofany.entity.Student;
import com.mofany.mapper.StudentMapper;
import com.mofany.mapper.impl.StudentMapperImpl;
import com.mofany.util.ProxyUtil;
import org.junit.Test;

/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description StudentMapperImplTest
 */
public class StudentMapperImplTest {
    private StudentMapper studentMapperProxy= (StudentMapper) ProxyUtil.createProxy(new StudentMapperImpl());
    private Student student=new Student();

    /**
     * 查询指定id记录
     * */
    @Test
    public void test1(){
        student.setId(666);
        System.out.println(studentMapperProxy.selectById(student));
    }

    /**
     * 查询总记录数
     * */
    @Test
    public void test2(){
        System.out.println(studentMapperProxy.selectTotalCount());
    }

    /**
     * 查询全部记录
     * */
    @Test
    public void test3(){
        System.out.println(studentMapperProxy.selectAll());
    }

    /**
     * 查询符合条件的记录
     * */
    @Test
    public void test4(){
        student.setId(1000);
        student.setName("user1");
        student.setSex("男");
        student.setAge((short) 23);
        studentMapperProxy.selectDynamicCondition(student).stream().forEach(System.out::println);
    }

    /**
     * 多条件查询
     * */
    @Test
    public void test5(){
        student.setId(999);
        //先匹配到用户名
        student.setName("user222");
        student.setSex("女");
        student.setAge((short) 26);
        System.out.println(studentMapperProxy.selectByFields(student));
    }

    /**
     * 多条件更新
     * */
    @Test
    public void test6(){
        //要更新的id
        student.setId(10);
        //新信息
        student.setName("mofanyu");
        student.setSex("男");
        student.setAge((short) 23);
        System.out.println(studentMapperProxy.updateByCondition(student));
    }

    /**
     * 查询多个id记录
     * */
    @Test
    public void test7(){
        int[] ids=new int[]{10,20,42,58,520,888,999};
        studentMapperProxy.selectByIds(ids).stream().forEach(System.out::println);
    }

    @Test
    public void test8(){

    }
}
