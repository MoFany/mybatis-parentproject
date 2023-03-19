package com.mofany;

import com.mofany.entity.Student;
import com.mofany.mapper.StudentMapper;
import com.mofany.mapper.impl.StudentMapperImpl;
import org.junit.Test;

/**
 * @author MoFany-J
 * @date 2022/12/8
 * @description StudentMapperImplTest
 */
public class StudentMapperImplTest {
    private StudentMapper studentMapper=new StudentMapperImpl();

    @Test
    public void queryById(){
        System.out.println(studentMapper.queryById(1000));
    }

    @Test
    public void insertData(){
        Student student=new Student();
        student.setName("宋江");
        student.setSex("男");
        student.setAge((short) 33);
        System.out.println(studentMapper.insertData(student));
    }

    @Test
    public void queryByName(){
        System.out.println(studentMapper.queryByName("宋江"));
    }
}
