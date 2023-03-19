package com.mofany.mapper.impl;

import com.mofany.entity.Student;
import com.mofany.mapper.StudentMapper;
import com.mofany.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description StudentMapperImpl
 */
public class StudentMapperImpl implements StudentMapper {
    private SqlSession sqlSession=SqlSessionFactoryUtil.getSqlSession();
    private StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

    /**
     * 按id查询
     *
     * @param student
     */
    @Override
    public Student selectById(Student student) {
        return mapper.selectById(student);
    }

    /**
     * 查询总记录数
     */
    @Override
    public int selectTotalCount() {
       return mapper.selectTotalCount();
    }

    /**
     * 查询全部
     */
    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }

    /**
     * 动态条件查询
     *
     * @param student
     */
    @Override
    public List<Student> selectDynamicCondition(Student student) {
        return mapper.selectDynamicCondition(student);
    }

    /**
     * 按多个字段查询
     *
     * @param student
     */
    @Override
    public Student selectByFields(Student student) {
        return mapper.selectByFields(student);
    }

    /**
     * 查询指定范围的id记录
     *
     * @param ids
     */
    @Override
    public List<Student> selectByIds(int... ids) {
        return mapper.selectByIds(ids);
    }

    /**
     * 多条件更新
     *
     * @param student
     */
    @Override
    public int updateByCondition(Student student) {
        int result=mapper.updateByCondition(student);
        sqlSession.commit();
        return result>0?result:0;
    }
}
