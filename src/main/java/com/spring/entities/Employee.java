package com.spring.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "employee_id", length = 36)
    private String employeeId;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "employee_name", length = 100)
    private String employeeName;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "position", length = 100)
    private String position;

    @Column(name = "username", length = 255)
    private String username;

    @Column(name = "working_place", length = 255)
    private String workingPlace;

    @OneToMany(mappedBy = "employee")
    private List<InjectionResult> injectionResults;
}
