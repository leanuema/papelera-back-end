package com.papelera.papeleraproject.account.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 4909544260780221407L;

    private Long userId;
    private String userName;
    private String password;
    private Long userStatus;
    private String email;
    private String name;
    private Date userDateFrom;
    private Date userDateTo;
    private List<UserRoleDTO> userRoleDTOList;

    public UserDTO() {
    }

    public UserDTO(Long userId, String userName, String password, Long userStatus, String email, String name, Date userDateFrom, Date userDateTo, List<UserRoleDTO> userRoleDTOList) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
        this.email = email;
        this.name = name;
        this.userDateFrom = userDateFrom;
        this.userDateTo = userDateTo;
        this.userRoleDTOList = userRoleDTOList;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", userDateFrom=" + userDateFrom +
                ", userDateTo=" + userDateTo +
                ", userRoleDTOList=" + userRoleDTOList +
                '}';
    }

    /**
     * Getter and Setter
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUserDateFrom() {
        return userDateFrom;
    }

    public void setUserDateFrom(Date userDateFrom) {
        this.userDateFrom = userDateFrom;
    }

    public Date getUserDateTo() {
        return userDateTo;
    }

    public void setUserDateTo(Date userDateTo) {
        this.userDateTo = userDateTo;
    }

    public List<UserRoleDTO> getUserRoleDTOList() {
        return userRoleDTOList;
    }

    public void setUserRoleDTOList(List<UserRoleDTO> userRoleDTOList) {
        this.userRoleDTOList = userRoleDTOList;
    }
}
