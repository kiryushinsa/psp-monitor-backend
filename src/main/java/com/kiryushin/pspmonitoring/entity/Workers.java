package com.kiryushin.pspmonitoring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="workers")
@Data
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "otchestvo")
    private String otchestvo;

    @Column(name = "level")
    private String level;

    @Column(name = "additional_spec")
    private String addSpec;

    @ManyToOne
    @JoinColumn(name = "squad")
    private Squad squad;
}
