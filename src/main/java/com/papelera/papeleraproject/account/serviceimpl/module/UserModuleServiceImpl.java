package com.papelera.papeleraproject.account.serviceimpl.module;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.account.repository.UserRepository;
import com.papelera.papeleraproject.account.service.module.UserModuleService;
import com.papelera.papeleraproject.configuration.enumerator.UserStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class UserModuleServiceImpl implements UserModuleService, UserDetailsService {

    private final Logger logger = Logger.getLogger(UserModuleServiceImpl.class.getName());

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> getAllUsers() throws Exception {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) throws Exception {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public User createUser(User user) throws Exception {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void changeStatusUser(Long id, Long userStatusId) throws Exception {
        userRepository.findById(id).ifPresent(userModel ->
                userModel.setUserStatus(userStatusId));
    }

    @Override
    @Transactional
    public User modifyUser(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) throws Exception {
        return userRepository.findUserByUserName(username);
    }

    @Override
    public void changeUserPassword(Long userId, String newPassword) {
        userRepository.findById(userId).ifPresent(user -> user.setPassword(bCryptPasswordEncoder.encode(newPassword)));
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.log(Level.INFO, "begin on method to search user by username: " + username);
        User user = new User();
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (username != null) {
            try {
                user = userRepository.findUserByUserName(username);
                logger.log(Level.INFO, "searching user");
                authorities = user.getUserRoleList().stream()
                        .map(userRole -> new SimpleGrantedAuthority(userRole.getRoleName()))
                        .peek(simpleGrantedAuthority -> logger.log(Level.INFO, simpleGrantedAuthority.getAuthority()))
                        .collect(Collectors.toList());
            } catch (Exception e) {
                logger.log(Level.SEVERE, "could not find user");
                e.printStackTrace();
            }
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                validateIsEnableUser(user.getUserStatus()), Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, authorities);
    }

    public Boolean validateIsEnableUser(Long userStatus) {
        if (userStatus != null && userStatus.equals(UserStatusEnum.USER_AVAILABLE.getId())) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
