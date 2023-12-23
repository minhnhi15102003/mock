package com.spring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "VaccineType")
public class VaccineType {
    @Id
    @Column(name = "vaccine_type_id", length = 36)
    private String vaccineTypeId;

    @Column(name = "description", length = 200)
    private String description;

    @Column(name = "vaccine_type_name", length = 50)
    private String vaccineTypeName;
}
