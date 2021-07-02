package com.papelera.papeleraproject.account.serviceimpl.module;

import com.papelera.papeleraproject.account.model.UserRole;
import com.papelera.papeleraproject.account.repository.UserRoleRepository;
import com.papelera.papeleraproject.account.service.module.UserRoleModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleModuleServiceImpl implements UserRoleModuleService {

    @Autowired
    protected UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> getAllUserRole() throws Exception {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole findById(Long userRoleId) throws Exception {
        return userRoleRepository.findById(userRoleId).orElse(null);
    }
}
