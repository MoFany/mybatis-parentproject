package com.mofany.mapper;

import com.mofany.entity.Student;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description Student
 */
public interface StudentMapper {
    /**
     * 按id查询
     * @param id 要查询的id
     * */
    Student queryById(int id);

    /**
     * 按姓名查询
     * @param name 要查询的姓名
     * */
    Student queryByName(String name);

    /**
     * 插入一条记录
     * @param student 要插入的对象，一条记录就是一个对象
     * */
    int insertData(Student student);
}
