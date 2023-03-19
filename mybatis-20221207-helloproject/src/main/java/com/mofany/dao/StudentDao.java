package com.mofany.dao;

import com.mofany.entity.Student;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description StudentDao 数据库表实体类
 */
public interface StudentDao {
    /**
     * @param id 要查询的学生id
     * @description 按id查询指定学生
     * */
    Student queryById(int id);

    /**
     * @param name 要查询的名字
     * @description 按用户名查询指定用户
     * */
    Student queryByName(String name);

    /**
     * @param count 要查询记录的条数
     * @description 一次性查询多条记录
     * */
    List<Student> queryByRange(int count);

    /**
     * @param student 要插入的学生
     * @description 插入一条记录
     * */
    int insertData(Student student);
}
