package com.mofany.mapper;

import com.mofany.model.TUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserRoleMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TUserRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUserRole record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TUserRole selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUserRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUserRole record);
}