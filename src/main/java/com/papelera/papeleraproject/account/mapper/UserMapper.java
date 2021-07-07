package com.papelera.papeleraproject.account.mapper;

import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.account.model.UserRole;
import com.papelera.papeleraproject.configuration.GenericMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper extends GenericMapper<User, UserDTO> {

    public User ToModel(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        return dozzerToModel(userDTO);
    }

    public UserDTO toDTO(User userModel) {
        if (userModel == null) {
            return null;
        }
        return dozzerToDTO(userModel);
    }
}
