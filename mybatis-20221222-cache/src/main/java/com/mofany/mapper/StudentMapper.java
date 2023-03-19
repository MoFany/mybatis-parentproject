package com.mofany.mapper;

import com.mofany.entity.Student;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description StudentMapper
 */
public interface StudentMapper {
    /**
     * 按id查询
     * */
    Student queryById(Student student);
}
