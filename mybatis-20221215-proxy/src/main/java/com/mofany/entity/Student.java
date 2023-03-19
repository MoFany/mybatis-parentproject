package com.mofany.entity;

import lombok.*;

/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description Student
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private short age;
}