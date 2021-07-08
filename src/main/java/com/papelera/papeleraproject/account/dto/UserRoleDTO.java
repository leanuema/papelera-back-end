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
public class UserRoleDTO implements Serializable {

    private static final long serialVersionUID = 3790349193018107484L;

    private Long userRoleId;
    private String roleName;
    private String roleDescription;

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "userRoleId=" + userRoleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }

}
