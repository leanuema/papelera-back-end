package com.papelera.papeleraproject.account.resource;

import com.papelera.papeleraproject.account.dto.ChangePasswordDTO;
import com.papelera.papeleraproject.account.dto.UserCreationDTO;
import com.papelera.papeleraproject.account.dto.UserDTO;
import com.papelera.papeleraproject.account.endpoint.UserEndPoint;
import com.papelera.papeleraproject.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin(origins = {"http://localhost:4200", "https://papelera-project.herokuapp.com/"})
@RestController
@RequestMapping(value = UserEndPoint.BASE)
public class UserResource implements UserEndPoint {

    private final Logger logger = Logger.getLogger(UserResource.class.getName());
    protected UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping(value = UserEndPoint.GET_ALL_USERS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<UserDTO> getAllUsers() {
        logger.log(Level.INFO, "Searching all users");
        List<UserDTO> userDTOList = new ArrayList<>();
        try {
            userDTOList = userService.getAllUsers();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error trying to retrieve all users");
        }
        return userDTOList;
    }

    @Override
    @GetMapping(value = UserEndPoint.FIND_USER_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public UserDTO findUserById(@RequestParam("userId") Long userId) {
        logger.log(Level.INFO, "Searching user by user-id = " + userId);
        UserDTO userDTO = new UserDTO();
        try {
            userDTO = userService.findUserById(userId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching user by user-id", e);
        }
        return userDTO;
    }

    @Override
    @PostMapping(value = UserEndPoint.CREATE_USER, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserCreationDTO user) {
        logger.log(Level.INFO, "Creating user " + user.toString());
        UserDTO userDTO = new UserDTO();
        try {
            userDTO = userService.createUser(user);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error trying to create user");
        }
        return userDTO;
    }

    @Override
    @PutMapping(value = UserEndPoint.CHANGE_USER_STATUS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void changeStatusUser(@RequestParam("userId") Long userId,
                                 @RequestParam("userStatusId") Long userStatusId) {
        logger.log(Level.INFO, "Changing status from user = " + userId);
        try {
            userService.changeStatusUser(userId, userStatusId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error trying to change user status to " + userStatusId, e);
        }
    }

    @Override
    @PutMapping(value = UserEndPoint.MODIFY_USER, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UserDTO modifyUser(@RequestBody UserDTO user) {
        logger.log(Level.INFO, "modifying user " + user.toString());
        UserDTO userDTO = new UserDTO();
        try {
            if (userService.findUserById(user.getUserId()) != null) {
                userDTO = userService.modifyUser(user);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error trying to modify user");
        }
        return userDTO;
    }

    @Override
    @PutMapping(value = UserEndPoint.CHANGE_USER_PASSWORD, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void changeUserPassword(@RequestParam("email") String email,
                                   @RequestBody ChangePasswordDTO changePasswordDTO) {
        try {
            userService.changeUserPassword(email, changePasswordDTO);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error changing user password", e);
        }
    }
}
