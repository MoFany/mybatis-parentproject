package com.mofany.mapper;

import com.mofany.model.TRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TRoleMapper {
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
    int insert(TRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TRole record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TRole selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TRole record);
}