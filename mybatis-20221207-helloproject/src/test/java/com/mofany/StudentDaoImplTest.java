package com.mofany;

import com.mofany.dao.StudentDao;
import com.mofany.dao.impl.StudentDaoImpl;
import com.mofany.entity.Student;
import org.junit.Test;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description StudentDaoImplTest 测试类
 */
public class StudentDaoImplTest {
    private StudentDao studentDao=new StudentDaoImpl();

    @Test
    public void queryById(){
        System.out.println(studentDao.queryById(112));
    }

    @Test
    public void queryByName(){
        System.out.println(studentDao.queryByName("admin"));
    }

    @Test
    public void queryByRange(){
        studentDao.queryByRange(20).stream().forEach(System.out::println);
    }

    @Test
    public void insertData(){
        Student student=new Student();
        student.setName("admin");
        student.setSex("男");
        student.setAge((short) 23);
        System.out.println(studentDao.insertData(student));
    }
}
