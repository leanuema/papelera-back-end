package com.papelera.papeleraproject.account.mapper;

import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.model.UserRole;
import org.springframework.stereotype.Component;

@Component
public class UserRoleMapper {

    public UserRole toModel(UserRoleDTO userRoleDTO) {
        UserRole userRole = new UserRole();
        userRole.setUserRoleId(userRoleDTO.getUserRoleId());
        userRole.setRoleName(userRoleDTO.getRoleName());
        userRole.setRoleDescription(userRoleDTO.getRoleDescription());
        return userRole;
    }

    public UserRoleDTO toDTO (UserRole userRole) {
        UserRoleDTO userRoleDTO = new UserRoleDTO();
        userRoleDTO.setUserRoleId(userRole.getUserRoleId());
        userRoleDTO.setRoleName(userRole.getRoleName());
        userRoleDTO.setRoleDescription(userRole.getRoleDescription());
        return userRoleDTO;
    }
}
