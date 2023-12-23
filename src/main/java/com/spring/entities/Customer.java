package com.spring.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "customer_id", length = 36)
    private String customerId;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "identity_card", length = 12)
    private String identityCard;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "user_name", length = 255)
    private String userName;

    @OneToMany(mappedBy = "customer")
    private List<InjectionResult> injectionResults;
}
