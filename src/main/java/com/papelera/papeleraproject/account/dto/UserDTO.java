package com.papelera.papeleraproject.account.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
