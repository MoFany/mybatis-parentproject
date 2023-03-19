package com.mofany.mapper;

import com.mofany.entity.Role;
import com.mofany.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/23
 * @description RoleMapper
 */
public interface RoleMapper {
    List<Role> queryAll();
}
