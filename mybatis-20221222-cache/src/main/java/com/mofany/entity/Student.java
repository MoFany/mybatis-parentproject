package com.mofany.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author MoFany-J
 * @date 2022/12/22
 * @description Student
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student{
    private Integer id;
    private String name;
    private String sex;
    private Short age;
}
