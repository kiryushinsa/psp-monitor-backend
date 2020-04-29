package com.kiryushin.pspmonitoring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "calls")
@Data
public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn (name = "who_go")
    private WorkShift who_go;

    @ManyToOne
    @JoinColumn(name = "squad")
    private Squad squad;

    @ManyToOne
    @JoinColumn (name = "type")
    private TypeOfEmergency type;

    @Column(name = "time")
    private Date time;

    @Column(name = "date")
    private Date date;

    @Column(name = "info")
    private String info;

    @Column(name = "who_send")
    private String whoSend;

    @Column(name = "who_accept")
    private String whoAccept;

    @Column(name = "time_gone")
    private Date time_gone;

    @Column(name = "time_arrive")
    private Date time_arrive;

    @Column(name = "time_local")
    private Date time_local;

    @Column(name = "time_destroy")
    private Date time_destroy;

    @Column(name = "time_back")
    private  Date time_back;

    @Column(name = "info_local")
    private String info_local;

    @Column(name = "image_url")
    private String image_url;


}
