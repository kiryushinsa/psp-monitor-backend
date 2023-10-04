package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "calls")

// ! WARNING NOT SET @DATA ANNOTATION
// DATA annotation get a stackoverflow error for many
// to many relationships

@Getter
@Setter

public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    @ManyToOne
    @JoinColumn(name = "squad")
    private Squad squad;

    /*
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="work_shifts",
            joinColumns = {@JoinColumn(name = "id_call", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_worker", referencedColumnName = "id")})
    private List<Workers> workers;
    */
    @JsonIgnore

    @ManyToMany(mappedBy = "worker_calls")
    Set <Workers> workersCalls;


    @OneToMany(cascade =  CascadeType.ALL, mappedBy = "calls")
    private Set<UsedTechnic> usedTechnic;

    @Column(name = "time")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date time;

    @Column(name = "date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    @Column(name = "info")
    private String info;

    @Column(name = "who_send")
    private String whoSend;

    @Column(name = "who_accept")
    private String whoAccept;

    @Column(name = "time_gone")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date timeGone;

    @Column(name = "time_arrive")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date timeArrive;

    @Column(name = "time_local")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date timeLocal;

    @Column(name = "time_destroy")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date timeDestroy;

    @Column(name = "time_back")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private  Date timeBack;

    @Column(name = "info_local")
    private String infoLocal;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "saved")
    private Integer saved;

    @Column(name = "died")
    private Integer died;

    @Column(name = "affected")
    private Integer affected;

    @Column(name = "address")
    private String address;

    @Column(name = "type")
    private String type;





}
