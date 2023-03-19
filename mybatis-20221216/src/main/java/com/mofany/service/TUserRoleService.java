package com.mofany.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mofany.model.TUserRole;
import com.mofany.mapper.TUserRoleMapper;
@Service
public class TUserRoleService{

    @Resource
    private TUserRoleMapper tUserRoleMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tUserRoleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TUserRole record) {
        return tUserRoleMapper.insert(record);
    }

    
    public int insertSelective(TUserRole record) {
        return tUserRoleMapper.insertSelective(record);
    }

    
    public TUserRole selectByPrimaryKey(Integer id) {
        return tUserRoleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TUserRole record) {
        return tUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TUserRole record) {
        return tUserRoleMapper.updateByPrimaryKey(record);
    }

}
