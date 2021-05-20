package com.kiryushin.pspmonitoring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tech_journal")
@Getter
@Setter
public class UsedTechnic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "time_work")
    private Integer time_work;

    @Column(name = "description")
    private String description;


    @ManyToOne
    @JoinColumn (name = "technic")
    private Technic technic;

    @ManyToOne
    @JoinColumn(name = "call")
    private Calls calls;

}
