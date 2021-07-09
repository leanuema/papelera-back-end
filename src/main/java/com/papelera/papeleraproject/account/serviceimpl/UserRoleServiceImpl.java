package com.papelera.papeleraproject.account.serviceimpl;

import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.mapper.UserRoleMapper;
import com.papelera.papeleraproject.account.service.UserRoleService;
import com.papelera.papeleraproject.account.service.module.UserRoleModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    protected UserRoleModuleService userRoleModuleService;
    protected UserRoleMapper userRoleMapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleModuleService userRoleModuleService, UserRoleMapper userRoleMapper) {
        this.userRoleModuleService = userRoleModuleService;
        this.userRoleMapper = userRoleMapper;
    }

    @Override
    public List<UserRoleDTO> getAllUserRole() throws Exception {
        return userRoleModuleService.getAllUserRole().stream().map(
                userRole -> userRoleMapper.toDTO(userRole)).collect(Collectors.toList());
    }

    @Override
    public UserRoleDTO findById(Long userRoleId) throws Exception {
        return userRoleMapper.toDTO(userRoleModuleService.findById(userRoleId));
    }
}
