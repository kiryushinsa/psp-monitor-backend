package com.kiryushin.pspmonitoring.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ToString.Exclude // exclude, because in call toString() methods have a recursive call between
    //user and role
    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
    List<User> users;

}
