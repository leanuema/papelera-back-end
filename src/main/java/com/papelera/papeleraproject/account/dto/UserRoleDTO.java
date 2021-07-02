package com.papelera.papeleraproject.account.dto;


import java.io.Serializable;

public class UserRoleDTO implements Serializable {

    private static final long serialVersionUID = 3790349193018107484L;

    private Long userRoleId;
    private String roleName;
    private String roleDescription;

    public UserRoleDTO() {
    }

    public UserRoleDTO(Long userRoleId, String roleName, String roleDescription) {
        this.userRoleId = userRoleId;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "UserRoleDTO{" +
                "userRoleId=" + userRoleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
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
