package com.kiryushin.pspmonitoring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "work_shift")
@Entity
public class WorkShift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "squad")
    private Squad squad;

    @Column(name="time")
    private Date time;

    @Column(name= "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name ="cap")
    private Workers cap;

    @ManyToOne
    @JoinColumn(name ="driver")
    private Workers driver;

    @ManyToOne
    @JoinColumn(name ="resc1")
    private Workers resc1;


    @ManyToOne
    @JoinColumn(name ="resc2")
    private Workers resc2;


    @ManyToOne
    @JoinColumn(name ="resc3")
    private Workers resc3;

    @ManyToOne
    @JoinColumn(name ="disp")
    private Workers disp;



}
