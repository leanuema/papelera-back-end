package com.papelera.papeleraproject.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

}
