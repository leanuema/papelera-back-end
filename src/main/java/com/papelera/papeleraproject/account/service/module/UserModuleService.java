package com.papelera.papeleraproject.account.service.module;

import com.papelera.papeleraproject.account.model.User;

import java.util.List;

public interface UserModuleService {

    List<User> getAllUsers() throws Exception;
    User findUserById(Long id) throws Exception;
    User createUser(User user) throws Exception;
    void changeStatusUser(Long id, Long userStatusId) throws Exception;
    User modifyUser(User user) throws Exception;
    User findUserByUsername(String username) throws Exception;
}
