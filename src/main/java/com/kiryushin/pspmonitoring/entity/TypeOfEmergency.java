package com.kiryushin.pspmonitoring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="type_of_emergency")
@Data
public class TypeOfEmergency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "squad")
    private Set<Calls> calls;

    @Column(name="type")
    private String type;
}
