package com.papelera.papeleraproject.account.mapper;

import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO userCreationToUserDTO(UserCreationDTO userCreationDTO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(userCreationDTO.getUserId());
        userDTO.setUserName(userCreationDTO.getUserName());
        userDTO.setPassword(userCreationDTO.getPassword());
        userDTO.setEmail(userCreationDTO.getEmail());
        return userDTO;
    }

    public User userCreationToUserModel(UserCreationDTO userCreationDTO) {
        User user = new User();
        user.setUserId(userCreationDTO.getUserId());
        user.setUserName(userCreationDTO.getUserName());
        user.setPassword(userCreationDTO.getPassword());
        user.setEmail(userCreationDTO.getEmail());
        return user;
    }
}
