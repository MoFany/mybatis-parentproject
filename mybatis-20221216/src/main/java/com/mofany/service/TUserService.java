package com.mofany.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mofany.mapper.TUserMapper;
import com.mofany.model.TUser;
@Service
public class TUserService{

    @Resource
    private TUserMapper tUserMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tUserMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    
    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    
    public TUser selectByPrimaryKey(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }

}
