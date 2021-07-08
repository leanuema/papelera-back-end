package com.papelera.papeleraproject.account.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 4909544260780221407L;

    private Long userId;
    private String userName;
    private String password;
    private Long userStatus;
    private String email;
    private String name;
    private Date userDateFrom;
    private Date userDateTo;
    private List<UserRoleDTO> userRoleList;

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", userDateFrom=" + userDateFrom +
                ", userDateTo=" + userDateTo +
                ", userRoleDTOList=" + userRoleList +
                '}';
    }

}
