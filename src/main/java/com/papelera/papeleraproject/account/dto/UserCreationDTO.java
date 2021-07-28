package com.papelera.papeleraproject.account.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreationDTO implements Serializable {

    private static final long serialVersionUID = -8286406803558166752L;

    private Long userId;
    private String userName;
    private String password;
    private String email;

}
