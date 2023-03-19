package com.mofany.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description Relation
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Relation {
    private Integer id;

    /**
     * 一对多的关系
     * */
    private User user;
    private Role role;
}
