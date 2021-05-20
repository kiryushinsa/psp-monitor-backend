package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="squad")
@Data
public class Squad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "squad")
    private List<Calls> calls;

    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "squad")
    private Set<Workers> workers;

    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "squad")
    private Set<Technic> technic;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "head")
    private String head;



}
