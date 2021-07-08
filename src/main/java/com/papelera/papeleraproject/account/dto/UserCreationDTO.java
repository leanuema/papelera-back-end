package com.papelera.papeleraproject.account.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationDTO implements Serializable {

    private static final long serialVersionUID = -8286406803558166752L;

    private String userName;
    private String password;

}
