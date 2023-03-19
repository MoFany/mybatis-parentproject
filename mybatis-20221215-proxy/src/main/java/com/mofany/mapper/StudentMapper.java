package com.mofany.mapper;

import com.mofany.entity.Student;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description StudentMapper
 */
public interface StudentMapper {
    /**
     * 按id查询
     * */
    Student selectById(Student student);

    /**
     * 查询全部
     * */
    List<Student> selectAll();

    /**
     * 动态条件查询
     * */
    List<Student> selectDynamicCondition(Student student);

    /**
     * 按多个字段查询
     * */
    Student selectByFields(Student student);

    /**
     * 查询指定范围的id记录
     * */
    List<Student> selectByIds(int...ids);

    /**
     * 多条件更新
     * */
    int updateByCondition(Student student);

    /**
     * 查询总记录数
     * */
    int selectTotalCount();

}
