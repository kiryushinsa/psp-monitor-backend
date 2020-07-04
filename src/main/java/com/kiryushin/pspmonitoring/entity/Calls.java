package com.kiryushin.pspmonitoring.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


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
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
    private Date time;

    @Column(name = "date")
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date date;

    @Column(name = "info")
    private String info;

    @Column(name = "who_send")
    private String whoSend;

    @Column(name = "who_accept")
    private String whoAccept;

    @Column(name = "time_gone")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
    private Date time_gone;

    @Column(name = "time_arrive")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
    private Date time_arrive;

    @Column(name = "time_local")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
    private Date time_local;

    @Column(name = "time_destroy")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
    private Date time_destroy;

    @Column(name = "time_back")
    @JsonFormat(pattern="HH:mm",timezone = "GMT+03:00")
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


}
