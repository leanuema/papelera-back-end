package com.papelera.papeleraproject.account.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User implements Serializable {

    private static final long serialVersionUID = 9149830306310337171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "USER_NAME", nullable = false)
    private String userName;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "USER_STATUS")
    private Long userStatus;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "USER_FULL_NAME")
    private String name;
    @Column(name = "USER_DATE_FROM")
    private Date userDateFrom;
    @Column(name = "USER_DATE_TO")
    private Date userDateTo;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHORIZATION",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ROLE_ID"),
    uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_ID", "USER_ROLE_ID"})
    })
    private List<UserRole> userRoleList;

    public User() {
    }

    public User(Long userId, String userName, String password, Long userStatus, String email, String name, Date userDateFrom, Date userDateTo, List<UserRole> userRoleList) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
        this.email = email;
        this.name = name;
        this.userDateFrom = userDateFrom;
        this.userDateTo = userDateTo;
        this.userRoleList = userRoleList;
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

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
