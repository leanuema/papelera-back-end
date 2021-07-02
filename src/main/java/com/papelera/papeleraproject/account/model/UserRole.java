package com.papelera.papeleraproject.account.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_ROLE")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 5581679039190883863L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ROLE_ID")
    private Long userRoleId;
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "ROLE_DESCRIPTION")
    private String roleDescription;

    public UserRole() {
    }

    public UserRole(Long userRoleId, String roleName, String roleDescription) {
        this.userRoleId = userRoleId;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    /**
     * Getter and Setter
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
