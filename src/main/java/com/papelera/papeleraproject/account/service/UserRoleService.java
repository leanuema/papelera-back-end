package com.papelera.papeleraproject.account.service;

import com.papelera.papeleraproject.account.dto.UserRoleDTO;

import java.util.List;

public interface UserRoleService {

    List<UserRoleDTO> getAllUserRole() throws Exception;
    UserRoleDTO findById(Long userRoleId) throws Exception;
}
