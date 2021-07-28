package com.papelera.papeleraproject.account.serviceimpl;

import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.mapper.UserMapper;
import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.account.service.UserService;
import com.papelera.papeleraproject.account.service.module.UserModuleService;
import com.papelera.papeleraproject.configuration.enumerator.UserStatusEnum;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private final UserModuleService userModuleService;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserModuleService userModuleService, UserMapper userMapper) {
        this.userModuleService = userModuleService;
        this.userMapper = userMapper;
    }

    public String returnStatus(UserStatusEnum productStatusEnum) {
        return productStatusEnum.getDescription();
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
        logger.log(Level.INFO, "mapping all users to DTO");
        return userModuleService.getAllUsers().stream().map(
                user -> new ModelMapper().map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO findUserById(Long id) throws Exception {
        logger.log(Level.INFO, "searching user with id: " + id);
        return new ModelMapper().map(userModuleService.findUserById(id), UserDTO.class);
    }

    @Override
    @Transactional
    public UserDTO createUser(UserCreationDTO user) throws Exception {
        logger.log(Level.INFO, "mapping to userDTO: " + user.toString());
        UserDTO userDTO = userMapper.userCreationToUserDTO(user);

        UserRoleDTO userRoleDTO = new UserRoleDTO();
        List<UserRoleDTO> userRoleDTOList = new ArrayList<>();
        userRoleDTO.setUserRoleId(2L);
        userRoleDTO.setRoleDescription("CLIENT");
        userRoleDTO.setRoleName("ROLE_CLIENT");
        userRoleDTOList.add(userRoleDTO);

        userDTO.setUserRoleList(userRoleDTOList);
        userDTO.setUserStatus(UserStatusEnum.USER_AVAILABLE.getId());
        userDTO.setUserDateFrom(new Date());
        return new ModelMapper().map(userModuleService.
                createUser(new ModelMapper().map(userDTO, User.class)), UserDTO.class);
    }

    @Override
    @Transactional
    public void changeStatusUser(Long id, Long userStatusId) throws Exception {
        logger.log(Level.INFO, "changing user with id= " + id + "status from user to = " + userStatusId);
        userModuleService.changeStatusUser(id, userStatusId);
    }

    @Override
    @Transactional
    public UserDTO modifyUser(UserDTO user) throws Exception {
        logger.log(Level.INFO, "modifying user: " + user.toString());
        return new ModelMapper().map(userModuleService.
                modifyUser(new ModelMapper().map(user, User.class)), UserDTO.class);
    }

    @Override
    @Transactional
    public void changeUserPassword(Long userId, String newPassword) {
        logger.log(Level.INFO, "change password from user");
        userModuleService.changeUserPassword(userId, newPassword);
    }
}
