package com.papelera.papeleraproject.account.endpoint;

import com.papelera.papeleraproject.account.dto.ChangePasswordDTO;
import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;

import java.util.List;

public interface UserEndPoint {

    String BASE = "/user";
    String ALL_OTHER_END_POINT = "/user/**";
    String GET_ALL_USERS = "/get-all-users";
    String FIND_USER_BY_ID = "/find-user-by-id";
    String FIND_USER_BY_ID_PARAM = "?userId={userId}";
    String CREATE_USER = "/create-user";
    String CHANGE_USER_STATUS = "/change-status-user";
    String CHANGE_USER_STATUS_PARAM = "?userId={userId}?userStatusId={userStatusId}";
    String MODIFY_USER = "/modify-user";
    String CHANGE_USER_PASSWORD ="/change-user-password";
    String CHANGE_USER_PASSWORD_PARAM ="?userId={userId}";

    List<UserDTO> getAllUsers();
    UserDTO findUserById(Long userId);
    UserDTO createUser(UserCreationDTO user);
    void changeStatusUser(Long userId, Long userStatusId);
    UserDTO modifyUser(UserDTO user);
    void changeUserPassword(String email, ChangePasswordDTO changePasswordDTO);

}
