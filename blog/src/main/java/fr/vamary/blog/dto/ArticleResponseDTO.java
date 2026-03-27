package fr.vamary.blog.dto;

import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class ArticleResponseDTO {

    private int id;
    private String title;
    private String description;
    private String content;
    private Date publishDate;
    private Date modificationDate;

}
