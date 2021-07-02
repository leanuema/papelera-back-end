package com.papelera.papeleraproject.account.service.module;

import com.papelera.papeleraproject.account.model.UserRole;

import java.util.List;

public interface UserRoleModuleService {

    List<UserRole> getAllUserRole() throws Exception;
    UserRole findById(Long userRoleId) throws Exception;

}
