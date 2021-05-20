package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="service")
@Getter
@Setter
public class ServiceTechnic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    @Column(name = "time")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date time;

    @Column(name = "who_spend")
    private String who_spend;

    @ManyToOne
    @JoinColumn (name = "technic")
    private Technic technic;



}
