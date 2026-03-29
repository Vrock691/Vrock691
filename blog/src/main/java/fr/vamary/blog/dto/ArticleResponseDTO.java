package fr.vamary.blog.dto;

import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleResponseDTO {

    private int id;
    private String title;
    private String description;
    private String content;
    private Instant publishDate;
    private Instant modificationDate;

}
