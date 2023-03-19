package com.mofany.entity;

import lombok.*;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description Student
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student {
    @Setter(value = AccessLevel.PRIVATE)
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String sex;
    @NonNull
    private short age;
}
