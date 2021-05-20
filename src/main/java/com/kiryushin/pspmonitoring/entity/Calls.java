package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;


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
    Set <Workers> workers_call;


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
    private Date time_gone;

    @Column(name = "time_arrive")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date time_arrive;

    @Column(name = "time_local")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date time_local;

    @Column(name = "time_destroy")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private Date time_destroy;

    @Column(name = "time_back")
    @JsonFormat(pattern="HH:MM:ss",timezone = "GMT+03:00")
    private  Date time_back;

    @Column(name = "info_local")
    private String info_local;

    @Column(name = "image_url")
    private String image_url;

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
