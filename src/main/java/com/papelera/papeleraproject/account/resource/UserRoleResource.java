package com.papelera.papeleraproject.account.resource;

import com.papelera.papeleraproject.account.dto.UserRoleDTO;
import com.papelera.papeleraproject.account.endpoint.UserRoleEndPoint;
import com.papelera.papeleraproject.account.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080", "https://papelera-project.herokuapp.com/"})
@RestController
@RequestMapping(value = UserRoleEndPoint.BASE)
public class UserRoleResource implements UserRoleEndPoint {

    @Autowired
    protected UserRoleService userRoleService;

    @Override
    @GetMapping(value = UserRoleEndPoint.GET_ALL_USER_ROLE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<UserRoleDTO> getAllUserRole() throws Exception {
        return userRoleService.getAllUserRole();
    }

    @Override
    @GetMapping(value = UserRoleEndPoint.FIND_USER_ROLE_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public UserRoleDTO findById(Long userRoleId) throws Exception {
        return userRoleService.findById(userRoleId);
    }

}