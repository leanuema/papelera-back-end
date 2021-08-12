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
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class UserModuleServiceImpl implements UserModuleService, UserDetailsService {

    private final Logger logger = Logger.getLogger(UserModuleServiceImpl.class.getName());
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserModuleServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public User createUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void changeStatusUser(Long id, Long userStatusId) {
        userRepository.findById(id).ifPresent(userModel -> userModel.setUserStatus(userStatusId));
    }

    @Override
    @Transactional
    public User modifyUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) throws Exception {
        return userRepository.findUserByUserName(username);
    }

    @Override

    public void changeUserPassword(String email, String newPassword, String newPasswordConfirmation) throws Exception {
        User user = findUserByEmail(email);
        if (user != null && newPassword.equals(newPasswordConfirmation)) {
            user.setPassword(bCryptPasswordEncoder.encode(newPassword));
        }
    }

    @Override
    public User findUserByEmail(String email) throws Exception {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public Long findLastUserId() throws Exception {
        return userRepository.findLastUserId() + 1;
    }


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.log(Level.INFO, "begin on method to search user by username: " + username);
        User user = new User();
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (Optional.ofNullable(username).isPresent()) {
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
