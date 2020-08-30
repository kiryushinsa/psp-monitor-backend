package com.kiryushin.pspmonitoring.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;


    @Column(name = "password")
    private String password;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name= "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @CreatedDate
    @Column(name="created")
    private Date created;

    @LastModifiedDate
    @Column(name="updated")
    private Date updated;



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")},
    inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "role_id")})
    private List<Role> roles;

}
