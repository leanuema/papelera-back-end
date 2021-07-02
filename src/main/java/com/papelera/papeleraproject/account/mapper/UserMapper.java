package com.papelera.papeleraproject.account.mapper;

import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.account.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    @Autowired
    private UserRoleMapper userRoleMapper;

    public User ToModel(UserDTO userDTO) {
        User userModel = new User();
        userModel.setUserId(userDTO.getUserId());
        userModel.setUserStatus(userDTO.getUserStatus());
        userModel.setEmail(userDTO.getEmail());
        userModel.setUserDateTo(userDTO.getUserDateTo());
        userModel.setName(userDTO.getName());
        userModel.setUserName(userDTO.getUserName());
        userModel.setPassword(userDTO.getPassword());
        userModel.setUserDateFrom(userDTO.getUserDateFrom());
        userModel.setUserRoleList((List<UserRole>) userRoleMapper.toModel((UserRoleDTO) userDTO.getUserRoleDTOList()));
        return userModel;
    }

    public UserDTO toDTO(User userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userModel.getUserId());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setUserName(userModel.getUserName());
        userDTO.setUserDateTo(userModel.getUserDateTo());
        userDTO.setUserStatus(userModel.getUserStatus());
        userDTO.setName(userModel.getName());
        userDTO.setUserDateFrom(userModel.getUserDateFrom());
        userDTO.setPassword(userModel.getPassword());
        return userDTO;
    }
}
