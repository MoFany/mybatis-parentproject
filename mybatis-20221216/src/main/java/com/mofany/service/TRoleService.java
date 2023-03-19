package com.mofany.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mofany.model.TRole;
import com.mofany.mapper.TRoleMapper;
@Service
public class TRoleService{

    @Resource
    private TRoleMapper tRoleMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tRoleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TRole record) {
        return tRoleMapper.insert(record);
    }

    
    public int insertSelective(TRole record) {
        return tRoleMapper.insertSelective(record);
    }

    
    public TRole selectByPrimaryKey(Integer id) {
        return tRoleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TRole record) {
        return tRoleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TRole record) {
        return tRoleMapper.updateByPrimaryKey(record);
    }

}
