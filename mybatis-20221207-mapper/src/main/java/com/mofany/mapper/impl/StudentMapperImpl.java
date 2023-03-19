package com.mofany.mapper.impl;

import com.mofany.entity.Student;
import com.mofany.mapper.StudentMapper;
import com.mofany.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author MoFany-J
 * @date 2022/12/8
 * @description StudentMapperImpl（结合动态代理CGLib）
 */
public class StudentMapperImpl implements StudentMapper {
    private SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
    /**
     * 使用动态代理进行方法生成与调用
     */
    private StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

    /**
     * 按id查询
     *
     * @param id 要查询的id
     */
    @Override
    public Student queryById(int id) {
        return mapper.queryById(id);
    }

    /**
     * 按姓名查询
     *
     * @param name 要查询的姓名
     */
    @Override
    public Student queryByName(String name) {
        return mapper.queryByName(name);
    }

    /**
     * 插入一条记录
     *
     * @param student 要插入的对象，一条记录就是一个对象
     */
    @Override
    public int insertData(Student student) {
        int result = 0;
        result = mapper.insertData(student);
        //提交事务
        sqlSession.commit();
        return result;
    }
}
