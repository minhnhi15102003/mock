package com.spring.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "InjectionResult")
public class InjectionResult {
    @Id
    @Column(name = "injection_result_id", length = 36)
    private String injectionResultId;

    @Column(name = "injection_date")
    private Date injectionDate;

    @Column(name = "injection_place", length = 255)
    private String injectionPlace;

    @Column(name = "next_injection_date")
    private Date nextInjectionDate;

    @Column(name = "number_of_injection", length = 100)
    private String numberOfInjection;

    @Column(name = "prevention", length = 100)
    private String prevention;

    @ManyToOne
    @JoinColumn(name = "vaccine_id")
    private Vaccine vaccine;

    @ManyToOne
    @JoinColumn(name = "injection_schedule_id")
    private InjectionSchedule injectionSchedule;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
