package com.papelera.papeleraproject.account.resource;

import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.endpoint.UserEndPoint;
import com.papelera.papeleraproject.account.service.UserService;
import com.papelera.papeleraproject.configuration.enumerator.UserRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080", "https://papelera-project.herokuapp.com/"})
@RestController
@RequestMapping(value = UserEndPoint.BASE)
public class UserResource implements UserEndPoint {

    @Autowired
    protected UserService userService;

    @Override
    @GetMapping(value = UserEndPoint.GET_ALL_USERS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<UserDTO> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }

    @Override
    @GetMapping(value = UserEndPoint.FIND_USER_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public UserDTO findUserById(@RequestParam("userId") Long userId) throws Exception {
        return userService.findUserById(userId);
    }

    @Override
    @PostMapping(value = UserEndPoint.CREATE_USER, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserCreationDTO user) throws Exception {
        return userService.createUser(user);
    }

    @Override
    @PutMapping(value = UserEndPoint.CHANGE_USER_STATUS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void changeStatusUser(@RequestParam("userId") Long userId,
                                 @RequestParam("userStatusId") Long userStatusId) throws Exception {
        userService.changeStatusUser(userId, userStatusId);
    }

    @Override
    @PutMapping(value = UserEndPoint.MODIFY_USER, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UserDTO modifyUser(@RequestBody UserDTO user) throws Exception {
        if (userService.findUserById(user.getUserId()) != null) {
            return userService.modifyUser(user);
        }
        throw new Exception();
    }

    @Override
    @PutMapping(value = UserEndPoint.CHANGE_USER_PASSWORD, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void changeUserPassword(@RequestParam("userId") Long userId,
                                   @RequestBody String newPassword) {
        userService.changeUserPassword(userId, newPassword);
    }
}
