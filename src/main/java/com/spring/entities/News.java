package com.spring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "News")
public class News {
    @Id
    @Column(name = "news_id", length = 36)
    private String newsId;

    @Column(name = "content", length = 4000)
    private String content;

    @Column(name = "preview", length = 1000)
    private String preview;

    @Column(name = "title", length = 300)
    private String title;

    @ManyToOne
    @JoinColumn(name = "news_type_id")
    private NewsType newsType;
}
