package com.kiryushin.pspmonitoring.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="workers")
// ! WARNING NOT SET @DATA ANNOTATION
// DATA annotation get a stackoverflow error for many
// to many relationships because is loop set for collections
@Getter
@Setter
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn (name = "squad")
    private Squad squad;

    //@ToString.Exclude // exclude, because in call toString() methods have a recursive call between
    //user and role
   /// @ManyToMany(mappedBy = "technic",fetch = FetchType.LAZY)
   // List<UsedTechnic> usedTechnic;


    @ManyToMany
    @JoinTable(
            name = "work_shifts",
            joinColumns = @JoinColumn(name = "id_worker"),
            inverseJoinColumns = @JoinColumn(name = "id_call")
    )
    Set<Calls> workerCalls;


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "level")
    private String level;

    @Column(name = "address")
    private String address;

    @Column(name = "additional_spec")
    private String addSpec;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name ="blood_type")
    private String bloodType;

    @Column(name ="phone")
    private String phone;

    @Column(name ="add_phone")
    private String addPhone;

    @Column(name ="contacts")
    private String contacts;

    @Column(name ="status")
    private String status;



}
