package com.spring.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Vaccine")
public class Vaccine {
    @Id
    @Column(name = "vaccine_id", length = 36)
    private String vaccineId;

    @Column(name = "contraindication", length = 200)
    private String contraindication;

    @Column(name = "indication", length = 200)
    private String indication;

    @Column(name = "number_of_injection")
    private Integer numberOfInjection;

    @Column(name = "origin", length = 50)
    private String origin;

    @Column(name = "time_begin_next_injection")
    private Date timeBeginNextInjection;

    @Column(name = "time_end_next_injection")
    private Time timeEndNextInjection;

    @Column(name = "`usage`", length = 200)
    private String usage;


    @Column(name = "vaccine_name", length = 100)
    private String vaccineName;

    @ManyToOne
    @JoinColumn(name = "vaccine_type_id")
    private VaccineType vaccineType;

    @OneToMany(mappedBy = "vaccine")
    private List<InjectionResult> injectionResults;
}
