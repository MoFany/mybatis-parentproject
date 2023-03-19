package com.mofany.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TUserRole implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;
}