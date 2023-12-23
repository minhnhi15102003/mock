package com.spring.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "InjectionSchedule")
public class InjectionSchedule {
    @Id
    @Column(name = "injection_schedule_id", length = 36)
    private String injectionScheduleId;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "place", length = 255)
    private String place;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "vaccine_id", length = 36)
    private String vaccineId;

    @OneToMany(mappedBy = "injectionSchedule")
    private List<InjectionResult> injectionResults;
}
