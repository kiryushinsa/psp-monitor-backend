package com.kiryushin.pspmonitoring.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="test")
// near lombok generated all getters/setter, hash code
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;
}
