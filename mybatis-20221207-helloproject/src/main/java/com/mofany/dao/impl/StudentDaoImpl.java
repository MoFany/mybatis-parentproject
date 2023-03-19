package com.mofany.dao.impl;

import com.mofany.dao.StudentDao;
import com.mofany.entity.Student;
import com.mofany.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description StudentDaoImpl
 */
public class StudentDaoImpl implements StudentDao {
    /**
     * 类的实例成员变量,sql会话对象
     * */
    private SqlSession sqlSession=SqlSessionFactoryUtil.getSqlSession();

    /**
     * @param id 要查询的学生id
     * @description 按id查询指定学生
     */
    @Override
    public Student queryById(int id) {
        //调用接口映射文件中指定命名空间的sql语句
        Student student = sqlSession.selectOne("student.queryById", id);

        return student;
    }

    /**
     * @param name 要查询的名字
     * @description 按用户名查询指定用户
     */
    @Override
    public Student queryByName(String name) {
        Student student=null;
        student=sqlSession.selectOne("student.queryByName",name);
        return student;
    }

    /**
     * @param count 要查询记录的条数
     * @description 一次性查询多条记录
     */
    @Override
    public List<Student> queryByRange(int count) {
        List<Student> studentList=sqlSession.selectList("student.queryByRange",count);
        return studentList;
    }

    /**
     * @param student 要插入的学生
     * @description 插入一条记录
     */
    @Override
    public int insertData(Student student) {
        int result=0;
        result=sqlSession.insert("student.insertData",student);
        //提交事务
        sqlSession.commit();
        return result;
    }
}
