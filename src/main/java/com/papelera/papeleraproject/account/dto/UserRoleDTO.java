package com.papelera.papeleraproject.account.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRoleDTO implements Serializable {

    private static final long serialVersionUID = 3790349193018107484L;

    private Long userRoleId;
    private String roleName;
    private String roleDescription;

}
