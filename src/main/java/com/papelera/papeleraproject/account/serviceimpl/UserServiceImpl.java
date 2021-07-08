package com.papelera.papeleraproject.account.serviceimpl;

import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.mapper.UserMapper;
import com.papelera.papeleraproject.account.service.UserService;
import com.papelera.papeleraproject.account.service.module.UserModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired
    private UserModuleService userModuleService;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
        logger.log(Level.INFO, "mapping all users to DTO");
        return userModuleService.getAllUsers().stream().map(
                user -> userMapper.toDTO(user)).collect(Collectors.toList());
    }

    @Override
    public UserDTO findUserById(Long id) throws Exception {
        logger.log(Level.INFO, "searching user with id: " + id);
        return userMapper.toDTO(userModuleService.findUserById(id));
    }

    @Override
    public UserDTO createUser(UserDTO user) throws Exception {
        logger.log(Level.INFO, "mapping to userDTO: " + user.toString());
        return userMapper.toDTO(userModuleService.createUser(userMapper.ToModel(user)));
    }

    @Override
    public void changeStatusUser(Long id, Long userStatusId) throws Exception {
        logger.log(Level.INFO, "changing user with id= " + id + "status from user to = " + userStatusId);
        userModuleService.changeStatusUser(id, userStatusId);
    }

    @Override
    public UserDTO modifyUser(UserDTO user) throws Exception {
        logger.log(Level.INFO, "modifying user: " + user.toString());
        return userMapper.toDTO(userModuleService.modifyUser(userMapper.ToModel(user)));
    }

    @Override
    public void changeUserPassword(Long userId, String newPassword) {
        logger.log(Level.INFO, "change password from user");
        userModuleService.changeUserPassword(userId, newPassword);
    }
}
