package com.papelera.papeleraproject.account.endpoint;

import com.papelera.papeleraproject.account.dto.UserRoleDTO;

import java.util.List;

public interface UserRoleEndPoint {

    String BASE = "/user-role";
    String ALL_OTHER_END_POINT = "/user-role/**";
    String GET_ALL_USER_ROLE = "/get-all-user-role";
    String FIND_USER_ROLE_BY_ID = "/find-user-role-by-id";

    List<UserRoleDTO> getAllUserRole() throws Exception;
    UserRoleDTO findById(Long userRoleId) throws Exception;
}
