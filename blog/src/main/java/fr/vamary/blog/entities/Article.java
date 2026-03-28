package fr.vamary.blog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String title;
    private String description;
    private String content;

    @CreationTimestamp
    private Instant publishDate;

    @UpdateTimestamp
    private Instant modificationDate;

}
