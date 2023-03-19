package com.mofany.entity;

import lombok.*;

/**
 * @author MoFany-J
 * @date 2022/12/7
 * @description Student
 *
 *
 * +-------+-------------+------+-----+---------+----------------+
 * | Field | Type        | Null | Key | Default | Extra          |
 * +-------+-------------+------+-----+---------+----------------+
 * | id    | int         | NO   | PRI | NULL    | auto_increment |
 * | name  | varchar(20) | NO   |     | NULL    |                |
 * | sex   | char(4)     | NO   |     | NULL    |                |
 * | age   | smallint    | NO   |     | NULL    |                |
 * +-------+-------------+------+-----+---------+----------------+
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
