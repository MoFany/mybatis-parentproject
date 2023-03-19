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
public class TUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private static final long serialVersionUID = 1L;
}