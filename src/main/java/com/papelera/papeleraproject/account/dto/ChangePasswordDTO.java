package com.papelera.papeleraproject.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordDTO implements Serializable {

    private static final long serialVersionUID = 4623692772720749439L;

    private String newPassword;
    private String newPasswordConfirmation;

}
