package com.spring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "NewsType")
public class NewsType {
    @Id
    @Column(name = "news_type_id", length = 36)
    private String newsTypeId;

    @Column(name = "description", length = 10)
    private String description;

    @Column(name = "news_type_name", length = 50)
    private String newsTypeName;
}
