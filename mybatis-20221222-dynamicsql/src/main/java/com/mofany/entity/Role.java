package com.mofany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description Role
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Role {
    private Integer id;
    private String rolename;
    private String roledesc;

    /**
     * 一对多：一个角色对应多个用户（站在部门的角度查用户）
     * */
    private List<User> userList;
}
