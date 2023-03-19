package com.mofany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description User
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
