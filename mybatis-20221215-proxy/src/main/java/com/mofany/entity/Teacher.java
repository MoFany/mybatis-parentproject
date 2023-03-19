package com.mofany.entity;

import lombok.*;

/**
 * @author MoFany-J
 * @date 2022/12/16
 * @description Teacher
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Teacher {
    @NonNull
    private Integer jobNum;
    @NonNull
    private String name;
    @NonNull
    private String sex;
    @NonNull
    private String subject;
}
