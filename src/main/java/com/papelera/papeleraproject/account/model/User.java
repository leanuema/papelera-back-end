package com.papelera.papeleraproject.account.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "AUTHORIZATION",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ROLE_ID"),
    uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_ID", "USER_ROLE_ID"})
    })
    private List<UserRole> userRoleList;

}
