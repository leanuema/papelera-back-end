package com.papelera.papeleraproject.account.service;

import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers() throws Exception;
    UserDTO findUserById(Long id) throws Exception;
    UserDTO createUser(UserCreationDTO user) throws Exception;
    void changeStatusUser(Long id, Long userStatusId) throws Exception;
    UserDTO modifyUser(UserDTO user) throws Exception;
    void changeUserPassword(Long userId, String newPassword);

}
