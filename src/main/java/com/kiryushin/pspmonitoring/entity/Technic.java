package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="technic")
@Getter
@Setter
public class Technic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    @Column(name = "start_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    @Column(name = "start_mileage")
    private Integer startMileage;

    @Column(name = "current_mileage")
    private Integer currentMileage;

    @Column(name = "coef")
    private Integer coef;

    @Column(name = "description")
    private String description;

    @Column(name = "characteristic")
    private String characteristic;

    @ManyToOne
    @JoinColumn (name = "squad")
    private Squad squad;

    @Column(name = "name")
    private String name;

   @OneToMany(cascade =  CascadeType.ALL,mappedBy = "technic")
   private Set<ServiceTechnic> service;

    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "technic")
    private Set<UsedTechnic> uses;

}
