package com.kiryushin.pspmonitoring.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


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
    private Integer timeWork;

    @Column(name = "description")
    private String description;


    @ManyToOne
    @JoinColumn (name = "technic")
    private Technic technic;

    @ManyToOne
    @JoinColumn(name = "call")
    private Calls calls;

}
